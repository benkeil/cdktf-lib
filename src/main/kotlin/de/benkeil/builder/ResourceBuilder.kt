package de.benkeil.builder

import com.hashicorp.cdktf.TerraformOutput
import software.constructs.Construct

abstract class ResourceBuilder<
    ResourceType : Any,
    BuilderType : software.amazon.jsii.Builder<ResourceType>,
    ConfigType,
    SelfType : ResourceBuilder<ResourceType, BuilderType, ConfigType, SelfType>>(
    internal val scope: Construct,
    id: String,
    internal val config: ConfigType,
    resourceTypeName: String,
    builderCreator: (Construct, String) -> BuilderType,
) {
  private val preBuildActions: MutableCollection<(SelfType) -> Unit> = mutableListOf()
  internal val computedId = createId(resourceTypeName, id)
  private val postBuildActions: MutableCollection<(ResourceType) -> Unit> = mutableListOf()
  internal val builder = builderCreator(scope, computedId)

  @Suppress("UNCHECKED_CAST")
  fun applyBuilder(block: BuilderType.() -> Unit): SelfType {
    builder.apply(block)
    return this as SelfType
  }

  @Suppress("UNCHECKED_CAST")
  fun addPreBuildAction(action: SelfType.() -> Unit): SelfType {
    preBuildActions.add(action)
    return this as SelfType
  }

  @Suppress("UNCHECKED_CAST")
  fun addPostBuildAction(action: (ResourceType) -> Unit): SelfType {
    postBuildActions.add(action)
    return this as SelfType
  }

  fun build(): ResourceType {
    preBuildActions.forEach { @Suppress("UNCHECKED_CAST") it(this as SelfType) }
    val resource = builder.build()
    postBuildActions.forEach { it(resource) }
    return resource
  }

  private fun createId(type: String, givenId: String) = "${type}_$givenId"

  fun withTerraformOutput(
      sensitive: Boolean = false,
      block: (ResourceType) -> Pair<String, Any>
  ): SelfType {
    return addPostBuildAction { resource ->
      val (key, value) = block(resource)
      TerraformOutput.Builder.create(scope, key).sensitive(sensitive).value(value).build()
    }
  }
}

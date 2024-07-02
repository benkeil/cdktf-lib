package de.benkeil.builder

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

  // TODO check how to remove warning
  // https://stackoverflow.com/questions/3921616/leaking-this-in-constructor-warning
  @Suppress("UNCHECKED_CAST")
  @SuppressWarnings("LeakingThisInConstructor")
  private val self: SelfType = this as SelfType

  fun applyBuilder(block: BuilderType.() -> Unit): SelfType {
    builder.apply(block)
    return self
  }

  fun addPreBuildAction(action: SelfType.() -> Unit): SelfType {
    preBuildActions.add(action)
    return self
  }

  fun addPostBuildAction(action: (ResourceType) -> Unit): SelfType {
    postBuildActions.add(action)
    return self
  }

  fun build(): ResourceType {
    preBuildActions.forEach { it(self) }
    val resource = builder.build()
    postBuildActions.forEach { it(resource) }
    return resource
  }

  private fun createId(type: String, givenId: String) = "${type}_$givenId"
}

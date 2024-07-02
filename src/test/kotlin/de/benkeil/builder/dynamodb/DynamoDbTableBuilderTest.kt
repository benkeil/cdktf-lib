package de.benkeil.builder.dynamodb

import com.hashicorp.cdktf.Testing
import de.benkeil.builder.fixtures.createTestEnvironment
import de.benkeil.stack.DefaultTerraformStack
import de.benkeil.stack.withDefaultAwsProvider
import io.kotest.core.spec.style.FunSpec

class DynamoDbTableBuilderTest :
    FunSpec({
      val app = Testing.app()
      val env = createTestEnvironment()
      val stack =
          DefaultTerraformStack(app, "test", env) {
                DynamoDbTableBuilder(app, "test", DynamoDbTableBuilder.Config(name = "test"))
                    .build()
              }
              .withDefaultAwsProvider()

      val synthesized = Testing.synth(stack)

      beforeTest { println(synthesized) }

      test("test") {}
    })

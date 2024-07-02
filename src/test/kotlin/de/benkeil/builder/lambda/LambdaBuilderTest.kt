package de.benkeil.builder.lambda

import com.hashicorp.cdktf.Testing
import de.benkeil.builder.fixtures.createTestEnvironment
import de.benkeil.stack.DefaultTerraformStack
import io.kotest.core.spec.style.FunSpec

class LambdaBuilderTest :
    FunSpec({
      val app = Testing.app()
      val env = createTestEnvironment()
      val stack =
          DefaultTerraformStack(app, "test", env) {
            LambdaBuilder(app, "lambda", LambdaBuilder.Config.kotlin("name"))
          }
      val synthesized = Testing.synth(stack)

      beforeTest { println(synthesized) }

      test("should return lambda builder with trigger") {}
    })

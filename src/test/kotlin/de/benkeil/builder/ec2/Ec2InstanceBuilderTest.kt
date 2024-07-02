package de.benkeil.builder.ec2

import com.hashicorp.cdktf.Testing
import de.benkeil.builder.ec2.cloudinit.FileEncoding
import de.benkeil.builder.ec2.cloudinit.Layout
import de.benkeil.builder.ec2.cloudinit.TableType
import de.benkeil.builder.ec2.cloudinit.User
import de.benkeil.builder.fixtures.createTestEnvironment
import de.benkeil.stack.DefaultTerraformStack
import io.kotest.core.spec.style.FunSpec

class Ec2InstanceBuilderTest :
    FunSpec({
      val app = Testing.app()
      val env = createTestEnvironment()
      val stack =
          DefaultTerraformStack(app, "test", env) {
            Ec2InstanceBuilder(this, "test")
                .withUserData {
                  cloudInit {
                    packageUpgrade()
                    writeFiles {
                      file("/opt/application/plain.txt", "Hello, World!")
                      file(
                          "/opt/application/b64.txt",
                          java.util.Base64.getEncoder().encodeToString("Hello, Ben!".toByteArray()),
                          encoding = FileEncoding.b64)
                    }
                    diskSetup {
                      alias("documents", "/dev/xvdb")
                      disk("documents", TableType.gpt, Layout.Single)
                      filesystem("documents", "xfs", "documents", "1")
                    }
                    mounts {
                      default("xfs", "defaults,nofail", "0", "2")
                      mount(aliasOrPath = "documents", fsFile = "/mnt/documents")
                    }
                    packages(update = true, upgrade = true) {
                      name("nginx")
                      name("docker")
                    }
                    users {
                      group("docker")
                      group("admin", listOf("benkeil"))
                    }
                    systemInfo { defaultUser(User(groups = listOf("docker"))) }
                  }
                  shellScript("custom-init.sh", "echo 'Hello, World!' > /tmp/hello.txt")
                }
                .build()
          }

      val synthesized = Testing.synth(stack)

      beforeTest { println(synthesized) }

      test("withUserData") {}
    })

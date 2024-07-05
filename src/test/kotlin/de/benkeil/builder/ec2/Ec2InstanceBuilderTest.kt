package de.benkeil.builder.ec2

import com.hashicorp.cdktf.Testing
import de.benkeil.builder.ec2.cloudinit.AnsibleInstallMethod
import de.benkeil.builder.ec2.cloudinit.FileEncoding
import de.benkeil.builder.ec2.cloudinit.Layout
import de.benkeil.builder.ec2.cloudinit.TableType
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
                    ansible {
                      packageName("ansible")
                      installMethod(AnsibleInstallMethod.distro)
                      runUser("ec2-user")
                      pull("https://github.com/benkeil/paperless.git", "playbook.yml")
                    }
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
                      default("ext4", "defaults,nofail", "0", "2")
                      mount(aliasOrPath = "documents", fsFile = "/mnt/documents")
                    }
                    packages(update = true, upgrade = true) {
                      name("nginx")
                      name("docker")
                    }
                    users {
                      defaultUser()
                      user(
                          "benkeil",
                          groups = listOf("admin"),
                          sshAuthorizedKeys = listOf("ssh-rsa iagdiuasgdiasgdi;ashdasgi;asg;idg"),
                      )
                      group("docker")
                      group("admin", listOf("benkeil"))
                    }
                    systemInfo { defaultUser(groups = listOf("docker")) }
                    runCmd("echo 'Hello, World!' > /tmp/hello.txt")
                  }
                  shellScript("custom-init.sh", "echo 'Hello, World!' > /tmp/hello.txt")
                }
                .build()
          }

      val synthesized = Testing.synth(stack)

      beforeTest { println(synthesized) }

      test("withUserData") {}
    })

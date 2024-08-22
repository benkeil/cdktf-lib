import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.9.22"
    kotlin("plugin.serialization") version "2.0.20"
    id("me.qoomon.git-versioning") version "6.4.3"
    application
    `maven-publish`
}

group = "de.benkeil"

apply {
    plugin("me.qoomon.git-versioning")
}

gitVersioning.apply {
    refs {
        considerTagsOnBranches = System.getenv()["CI"]?.toBoolean() ?: false
        tag("v(?<version>.+)") {
            version = "\${ref.version}"
        }
        branch(".+") {
            version = "\${ref}"
        }
    }
}

repositories {
    mavenCentral()
    maven {
        name = "GitHubPackages"
        url = uri("https://maven.pkg.github.com/benkeil/*")
        credentials {
            username = "not_required"
            password = System.getenv("GITHUB_PACKAGES_READ_TOKEN")
        }
        content {
            includeGroupByRegex("de\\.benkeil.*")
        }
    }
}

dependencies {
    implementation(libs.bundles.implementation)
    testImplementation(libs.bundles.testImplementation)
}

kotlin {
    jvmToolchain(17)
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}

tasks.withType<Javadoc> {
    with(options as StandardJavadocDocletOptions) {
        addBooleanOption("html5", true)
        addBooleanOption("Xdoclint:none", true)
    }
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        freeCompilerArgs = freeCompilerArgs + "-Xcontext-receivers"
    }
}

java {
    withJavadocJar()
    withSourcesJar()
}

publishing {
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/benkeil/${rootProject.name}")
            credentials {
                username = "not_required"
                password = System.getenv("GITHUB_PACKAGES_WRITE_TOKEN")
            }
        }
    }

    publications {
        register<MavenPublication>("gpr") {
            from(components["java"])
        }
    }
}

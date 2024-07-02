package de.benkeil.builder.fixtures

import de.benkeil.model.DefaultEnvironment
import de.benkeil.model.Stage

fun createTestEnvironment(): DefaultEnvironment =
    TestEnvironment(Stage.TEST, "eu-central-1", "service", "awsAccountId")

class TestEnvironment(
    override val stage: Stage,
    override val awsRegion: String,
    override val service: String,
    override val awsAccountId: String,
) : DefaultEnvironment

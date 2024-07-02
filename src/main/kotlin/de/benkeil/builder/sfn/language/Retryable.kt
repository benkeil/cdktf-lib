package de.benkeil.builder.sfn.language

import de.benkeil.builder.sfn.language.states.States
import kotlin.time.Duration

interface Retryable {
  var retry: ArrayList<Retry>?
  var catch: ArrayList<Catch>?
}

interface RetryableBuilder {
  fun retry(retry: Retry)

  fun retry(
      errors: Collection<String>,
      interval: Duration? = null,
      maxAttempts: Int? = null,
      backoffRate: Double? = null,
      maxDelay: Duration? = null,
      jitterStrategy: JitterStrategy? = null,
  )

  fun retries(): ArrayList<Retry>?

  fun catch(
      errors: Collection<String>,
      next: Strand,
  )

  fun catch(
      errors: Collection<String>,
      next: StrandContext.() -> Unit,
  )

  fun catch(
      errors: Collection<String>,
      block: CatchContext.() -> Unit,
      next: Strand,
  )

  fun catch(
      errors: Collection<String>,
      block: CatchContext.() -> Unit,
      next: StrandContext.() -> Unit,
  )

  fun catches(): ArrayList<Catch>?
}

context(DefinitionContext)
class RetryableBuilderImpl : RetryableBuilder {
  private var retries: ArrayList<Retry>? = null
  private var catches: ArrayList<Catch>? = null

  override fun retry(retry: Retry) {
    if (retries == null) {
      retries = arrayListOf()
    }
    retries!!.add(retry)
  }

  override fun retry(
      errors: Collection<String>,
      interval: Duration?,
      maxAttempts: Int?,
      backoffRate: Double?,
      maxDelay: Duration?,
      jitterStrategy: JitterStrategy?,
  ) {
    retry(
        Retry(
            errors,
            interval?.inWholeSeconds?.toInt(),
            maxAttempts,
            backoffRate,
            maxDelay?.inWholeSeconds?.toInt(),
            jitterStrategy,
        ),
    )
  }

  override fun retries(): ArrayList<Retry>? = retries

  private fun addCatch(catch: Catch) {
    if (catches == null) {
      catches = arrayListOf()
    }
    catches!!.add(catch)
  }

  override fun catch(
      errors: Collection<String>,
      next: Strand,
  ) {
    addCatch(Catch(errors, next.states.first().id, null))
  }

  override fun catch(
      errors: Collection<String>,
      next: StrandContext.() -> Unit,
  ) {
    val strand = strand(next)
    catch(errors, strand)
  }

  override fun catch(
      errors: Collection<String>,
      block: CatchContext.() -> Unit,
      next: Strand,
  ) {
    val context = CatchContext(errors, next).apply(block)
    val catch = context.build()
    addCatch(catch)
  }

  override fun catch(
      errors: Collection<String>,
      block: CatchContext.() -> Unit,
      next: StrandContext.() -> Unit
  ) {
    val strand = strand(next)
    catch(errors, block, strand)
  }

  override fun catches(): ArrayList<Catch>? = catches
}

class CatchContext(
    private val errors: Collection<String>,
    private val next: Strand,
) : ResultPathBuilder by ResultPathBuilderImpl() {
  fun build(): Catch =
      Catch(
          errorEquals = errors,
          next = next.states.first().id,
          resultPath = resultPath(),
      )
}

data class Retry(
    /**
     * You can also use {@link States} to specify a set of errors.
     *
     * @see States
     */
    val errorEquals: Collection<String>,
    val intervalSeconds: Int? = null,
    val maxAttempts: Int? = null,
    val backoffRate: Double? = null,
    val maxDelaySeconds: Int? = null,
    val jitterStrategy: JitterStrategy? = null,
) {
  init {
    if (intervalSeconds != null) {
      require(intervalSeconds > 0) { "intervalSeconds must be greater than 0" }
      require(intervalSeconds <= 99999999) { "intervalSeconds must be less than or equal 99999999" }
    }
  }
}

class Catch(
    /**
     * You can also use {@link States} to specify a set of errors.
     *
     * @see States
     */
    val errorEquals: Collection<String>,
    val next: String,
    override val resultPath: String?,
) : ResultPath

enum class JitterStrategy {
  FULL,
  NONE,
}

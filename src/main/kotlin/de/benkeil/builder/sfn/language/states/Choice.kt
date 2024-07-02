package de.benkeil.builder.sfn.language.states

import de.benkeil.builder.sfn.language.*

class Choice(
    id: String,
    val choices: ArrayList<ChoiceRule>,
    val default: String?,
    override val comment: String?,
    override val inputPath: String?,
    override val outputPath: String?,
) : State(id, Type.Choice), Commentable, InputOutput

context(DefinitionContext)
@AmazonStatesLanguageDsl
class ChoiceContext(
    private val id: String,
) : CommentableBuilder by CommentableBuilderImpl(), InputOutputBuilder by InputOutputBuilderImpl() {
  internal val choices = arrayListOf<ChoiceRule>()
  internal var default: String? = null

  fun and(block: DataTestExpressionContext.() -> Unit, next: StrandContext.() -> Unit) {
    val strand = this@DefinitionContext.strand(next)
    and(block, strand)
  }

  fun and(block: DataTestExpressionContext.() -> Unit, next: Strand) {
    val expressions = DataTestExpressionContext().apply(block).build()
    choices.add(
        ChoiceRule(
            and = expressions,
            next = next.states.first().id,
        ),
    )
  }

  fun or(block: DataTestExpressionContext.() -> Unit, next: StrandContext.() -> Unit) {
    val strand = this@DefinitionContext.strand(next)
    or(block, strand)
  }

  fun or(block: DataTestExpressionContext.() -> Unit, next: Strand) {
    val expressions = DataTestExpressionContext().apply(block).build()
    choices.add(
        ChoiceRule(
            or = expressions,
            next = next.states.first().id,
        ),
    )
  }

  fun not(block: DataTestExpressionContext.() -> Unit, next: StrandContext.() -> Unit) {
    val strand = this@DefinitionContext.strand(next)
    not(block, strand)
  }

  fun not(block: DataTestExpressionContext.() -> Unit, next: Strand) {
    val expressions = DataTestExpressionContext().apply(block).build()
    require(expressions.size == 1) { "Not can only have one expression" }
    choices.add(
        ChoiceRule(
            not = expressions[0],
            next = next.states.first().id,
        ),
    )
  }

  fun default(next: StrandContext.() -> Unit) {
    val strand = this@DefinitionContext.strand(next)
    default(strand)
  }

  fun default(next: Strand) {
    default = next.states.first().id
  }

  fun expression(block: DataTestExpressionContext.() -> Unit, next: StrandContext.() -> Unit) {
    val strand = this@DefinitionContext.strand(next)
    expression(block, strand)
  }

  fun expression(block: DataTestExpressionContext.() -> Unit, next: Strand) {
    val expressions = DataTestExpressionContext().apply(block).build()
    choices.add(
        ChoiceRule(
            not = expressions[0],
            next = next.states.first().id,
        ),
    )
  }

  fun build(): Choice =
      Choice(
          id = id,
          choices = choices,
          default = default,
          comment = comment(),
          inputPath = inputPath(),
          outputPath = outputPath(),
      )
}

class DataTestExpressionContext {
  private val expressions = arrayListOf<TestExpression>()

  // https://docs.aws.amazon.com/step-functions/latest/dg/amazon-states-language-choice-state.html

  private fun validateVariable(variable: String) {
    require(variable.startsWith("$")) { "Variable must start with a $ sign" }
  }

  fun stringEquals(variable: String, value: String) {
    validateVariable(variable)
    val expression = TestExpression(variable = variable, stringEquals = value)
    expressions.add(expression)
  }

  fun numericLessThan(variable: String, value: Number) {
    validateVariable(variable)
    val expression = TestExpression(variable = variable, numericLessThan = value)
    expressions.add(expression)
  }

  fun numericGreaterThan(variable: String, value: Number) {
    validateVariable(variable)
    val expression = TestExpression(variable = variable, numericGreaterThan = value)
    expressions.add(expression)
  }

  fun isPresent(variable: String, value: Boolean = true) {
    validateVariable(variable)
    val expression = TestExpression(variable = variable, isPresent = value)
    expressions.add(expression)
  }

  fun build(): ArrayList<TestExpression> = expressions
}

class TestExpression(
    val variable: String,
    val stringEquals: String? = null,
    val numericLessThan: Number? = null,
    val numericGreaterThan: Number? = null,
    val isPresent: Boolean? = null,
)

class ChoiceRule(
    val or: ArrayList<TestExpression>? = null,
    val and: ArrayList<TestExpression>? = null,
    val not: TestExpression? = null,
    val next: String,
)

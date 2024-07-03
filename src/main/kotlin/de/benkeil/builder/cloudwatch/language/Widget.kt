package de.benkeil.builder.cloudwatch.language

sealed class Widget<P>(
    val type: String,
    var width: Int? = null,
    var height: Int? = null,
    var x: Int? = null,
    var y: Int? = null,
) {
  abstract val properties: P

  fun withCoordinates(
      width: Int,
      height: Int,
      x: Int,
      y: Int,
  ): Widget<*> {
    return this.apply {
      this.width = width
      this.height = height
      this.x = x
      this.y = y
    }
  }

  override fun toString(): String {
    return "Widget(type='$type', width=$width, height=$height, x=$x, y=$y, properties=$properties)"
  }
}

package de.benkeil.model

import kotlin.math.pow

@JvmInline
value class Size internal constructor(private val rawValue: Long) : Comparable<Size> {

  override fun compareTo(other: Size): Int {
    return rawValue.compareTo(other.rawValue)
  }

  fun to(unit: Unit): Long = unit.convert(rawValue, unit)

  val inBytes: Long
    get() = to(Size.Unit.BYTES)

  val inKiloBytes: Long
    get() = to(Size.Unit.KILO_BYTES)

  val inMegaBytes: Long
    get() = to(Size.Unit.MEGA_BYTES)

  val inGigaBytes: Long
    get() = to(Size.Unit.GIGA_BYTES)

  enum class Unit(private val basis: Int, private val exponent: Int) {
    BYTES(1024, 0),
    KILO_BYTES(1024, 1),
    MEGA_BYTES(1024, 2),
    GIGA_BYTES(1024, 3),
    ;

    fun toBytes(value: Long): Long = value * basis.toDouble().pow(exponent).toLong()

    fun convert(bytes: Long, to: Unit): Long {
      if (to.exponent == 0) {
        return bytes
      }
      return bytes / to.basis.toDouble().pow(to.exponent).toLong()
    }
  }
}

val Int.bytes: Size
  get() = toSize(Size.Unit.BYTES)
val Int.kiloBytes: Size
  get() = toSize(Size.Unit.KILO_BYTES)
val Int.megaBytes: Size
  get() = toSize(Size.Unit.MEGA_BYTES)
val Int.gigaBytes: Size
  get() = toSize(Size.Unit.GIGA_BYTES)

fun Int.toSize(unit: Size.Unit): Size {
  return toLong().toSize(unit)
}

val Long.bytes: Size
  get() = toSize(Size.Unit.BYTES)
val Long.kiloBytes: Size
  get() = toSize(Size.Unit.KILO_BYTES)
val Long.megaBytes: Size
  get() = toSize(Size.Unit.MEGA_BYTES)
val Long.gigaBytes: Size
  get() = toSize(Size.Unit.GIGA_BYTES)

fun Long.toSize(unit: Size.Unit): Size {
  return Size(unit.toBytes(this))
}

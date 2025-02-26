import kotlin.ULong.Companion.MAX_VALUE as U_LONG_MAX_VALUE

fun types() {
    // Integers: Byte, Short, Int, Long
    val byteMin: Byte = -128
    val byteMax: Byte = 127
    val intMin: Int = -2147483648
    val intMax: Int = 2147483647
    val longMin: Long = -9_223_372_036_854_775_807
    val longMax: Long = 9_223_372_036_854_775_807

    // Unsigned integers: UByte, UShort, UInt, ULong
    val uByteMin: UByte = 0u
    val uByteMax: UByte = 255u
    val uShortMin: UShort = 0u
    val uShortMax: UShort = 65535u
    val uIntMin: UInt = 0u
    val uIntMax: UInt = 4_294_967_295u
    val uLongMin: ULong = 0u
    val uLongMax: ULong = 18_446_744_073_709_551_615u
    if (uLongMax != U_LONG_MAX_VALUE) {
        println("WTF?")
    }

    // Floating-point numbers: Float, Double
    // Default is Double
    val currentTemp: Float = 24.5F
    val price: Double = 19.99

    // Booleans: Boolean
    val isEnabled: Boolean = true

    // Characters: Char
    val separator: Char = '\n'

    // Strings: String
    val message: String = "Hello, world!"

    // Variable declared without initialization
    val strangeVariable: Int
    // Triggers an error
    // println(strangeVariable)
    // Variable 'd' must be initialized
}
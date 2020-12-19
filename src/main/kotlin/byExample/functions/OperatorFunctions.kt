package byExample.functions

operator fun Int.times(str: String) = str.repeat(this)

operator fun String.get(range: IntRange) = substring(range)
val str = "always forgive your emenies; nothing annoys them so much"

fun main() {
    println(2*"bye ")
    println(str[0..14])
}
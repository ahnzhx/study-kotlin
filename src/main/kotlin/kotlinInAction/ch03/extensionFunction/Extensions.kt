package kotlinInAction.ch03.extensionFunction

//fun String.lastChar(): Char = get(length-1)
val String.lastChar: Char
    get() = get(length-1)

var StringBuilder.lastChar: Char
get() = get(length-1)
set(value: Char){
    this.setCharAt(length-1, value)
}

fun <T> Collection<T>.joinToString(
    separator: String=", ",
    prefix: String="",
    postfix: String=""
): String{
    val result = StringBuilder(prefix)
    for((index, element) in this.withIndex()){
        if(index >  0) result.append(separator)
        result.append(element)

    }
    result.append(postfix)
    return result.toString()

}

// 문자열 컬렉션에 대해서만 호출할 수 있는 join 함수를 정의할 때
fun Collection<String>.join(
    separator: String=", ",
    prefix: String="",
    postfix: String=""
)=joinToString(separator, prefix, postfix)

fun main(){
    val list = listOf(1,2,3)
    println(list.joinToString(separator = "; ", prefix="(", postfix=")"))
    println(listOf("one", "two", "three").join(" "))

    println("Kotlin".lastChar)
    val sb = StringBuilder("Kotlin?")
    sb.lastChar='!'
    println(sb)
}

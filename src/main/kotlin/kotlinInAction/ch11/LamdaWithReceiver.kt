package kotlinInAction.ch11

fun buildString(
    builderAction: StringBuilder.() -> Unit // 수신 객체가 있는 함수 타입의 파라미터를 선언한다.
): String{
    val sb = StringBuilder()
    sb.builderAction() // StringBuilder 인스턴스를 람다의 수신객체로 넘긴다.
    return sb.toString()
}

fun main() {
    val s = buildString {
        this.append("hello, ")
        append("World!")
    }

    println(s)
}
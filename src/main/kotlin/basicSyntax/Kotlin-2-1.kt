package basicSyntax

fun main(args: Array<String>){
    val name: String by lazy {getName()}
    println("안녕")
    val name2: String by lazy {name}
    println("안녕2")
    println(name)
    println(name2)
    println(name)
    println(name2)
}

fun getName(): String {
    println("이름 계산중")
    return "Frank 현석 oh"
}
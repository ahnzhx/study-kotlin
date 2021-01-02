package kotlinInAction.ch03.extensionFunction

class VarargsTest{
    // TODO: Companion object 안에 선언해줘야 하는 이유
    // TODO: @JvmStatic 을 붙여줘야 하는 이유
    // https://kotlinlang.org/docs/reference/java-to-kotlin-interop.html#static-methods
    companion object{
//        @JvmStatic
//        fun main(args: Array<String>){
//            val list = listOf("args: ", *args)
//            println(list)
//        }
    }


}
fun main(args: Array<String>) {
    val list = listOf("args: ", *args)
    println(list)
}

infix fun Any.to(other: Any) = Pair(this, other)

infix fun Any.ro(value: String) = Pair(this, value)

fun roInfixTest(){
    val map = mapOf(1 ro "ss", 2 ro "3")
}
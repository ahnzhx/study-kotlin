package basicSyntax


val items = listOf("apple", "banana", "kiwifruit")
val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
class TypeCheckAndAutomaticCasts {
    // TODO: return type 이 int 인데 어떻게 String을 리턴하지
    fun getStringLength(obj: Any): Int? {
        if(obj is String)
            return obj.length
        return null
    }

    fun getStringLength2(obj: Any): Int? {
        if(obj !is String) return null

        // obj id automatically cast to String in this branch
        return obj.length
    }
}

fun forLoop(){

    for(item in items){
        println(item)
    }

    for(index in items.indices){
        println("item at $index is ${items[index]}")
    }
}

fun range(){
    val x = 10
    val y = 9
    if(x in 1..y+1)
        println("fits in range")

    val list  = listOf("a", "B", "c")
    if(-1 !in 0..list.lastIndex)
        println("-1 is out of range")
    if(list.size !in list.indices)
        println(list.size)
        println(list.indices)
        println("list size is out of valid list indices range, too")

    for(x in 1..10 step 2) print(x)
    println()
    for(x in 9 downTo 0 step 3) print(x)

}

fun collections() {
    when{
        "orange" in items -> println("juice")
        "apple" in items -> println("apple is fine too")
    }

    fruits.filter { it.startsWith("a") }
          .sortedBy{ it }
          .map{ it.toUpperCase() }
          .forEach{ println(it) }
}
fun main(args: Array<String>){
    //forLoop()
    //range()
    collections()
}
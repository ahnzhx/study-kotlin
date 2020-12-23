package kotlinInAction.ch03.collections

class BasicCollections {
    fun basic(){
        val strings = listOf("first", "second", "third")
        val set = hashSetOf(1,3,5)
        val map = hashMapOf(1 to "one", 2 to "two", 3 to "three")
        println(set.javaClass)
        println(map.javaClass)

        val last: String = strings.last()
    }
}
fun main(){
    val bc = BasicCollections()
    bc.basic()
    test()
}

fun test(){
    val list = listOf(1,2,3)
    println(joinToString(list, separator=" ", prefix=" ", postfix=" ."))
    // 앞에 파라미터 이름을 명시해주면 파라미터 위치를 항상 같도록 써줄 필요가 없다.
    println(joinToString(list, postfix=" &&",  prefix="# " ))
}

/**
 * default parameter value
 */
@JvmOverloads
fun<T> joinToString(
    collection: Collection<T>,
    separator: String = ",",
    prefix: String = "",
    postfix: String = ""
): String{
    val result = StringBuilder(prefix)
    for((index, element) in collection.withIndex()){
        if(index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}
@file: JvmName("StringFunctions") // 클래스 이름을 지정하는 애노테이션
package kotlinInAction.ch03.collections

fun<T> joinToString2(
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
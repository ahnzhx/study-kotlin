package kotlinInAction.ch09

import java.util.function.Predicate

class GenericTypeParameter {
    val readers1 : MutableList<String> = mutableListOf()
    val readers2 = mutableListOf<String>()

    val authors = listOf("dimitry", "svetlana")
    val readers = mutableListOf<String>(/**/)

//    fun <T> List<T>.filter(predicate: (T) -> Boolean): List<T>
    val <T> List<T>.penultimate: T
        get() = this[size - 2]
}

fun <T : Number> oneHalf(value: T): Double{
    return value.toDouble() / 2.0 // Number 클래스에 정의된 메소드를 호출한다.
}

class Processor<T>{
    fun process(value: T){
        value?.hashCode()
    }
}

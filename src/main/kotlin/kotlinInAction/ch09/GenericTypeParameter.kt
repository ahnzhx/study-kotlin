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
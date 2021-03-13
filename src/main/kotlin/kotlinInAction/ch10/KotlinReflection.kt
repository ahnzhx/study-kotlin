package kotlinInAction.ch10

import kotlinInAction.ch08.Person

fun main() {
    val person = Person("Alice", 27)
    val kClass = person.javaClass.kotlin

    println(kClass.simpleName)
    // memberProperties -> members 로 변경
    kClass.members.forEach{ println(it.name)}
    
}
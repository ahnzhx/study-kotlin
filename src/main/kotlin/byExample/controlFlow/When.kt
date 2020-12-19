package byExample.controlFlow

fun main() {
    cases("hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("Hello")
    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))

    for (animal in zoo) {                                   // 3
        println("Watch out, it's a ${animal.name}")
    }
}
fun cases(obj : Any){
    when(obj){
        1 -> println("One")
        "hello" -> println("greeting")
        is Long -> println("Long")
        !is String -> println("not a String")
        else -> println("unknown")
    }
}

class MyClass

class Animal(val name: String)

class Zoo(val animals: List<Animal>) {

    // ListIterator()가 있는데 굳이 만들어서 써준다?
    operator fun iterator(): Iterator<Animal> {             // 1
        return animals.iterator()                           // 2
    }
}
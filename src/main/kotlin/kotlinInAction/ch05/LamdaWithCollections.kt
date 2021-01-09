package kotlinInAction.ch05



data class Person(val name: String, val age: Int)

val people= listOf(Person("Alice", 29), Person("Bob", 31))
val names = people.joinToString(" ") { p: Person -> p.name }

val list = listOf(1,2,3,4)


fun main(){
    println(people.maxBy { it.age })
    println(people.maxBy(Person::age))
    run{println(42)}
    println(names)
    println(list.map { it * it })
    println(people.map { it.name })

    println(people.filter { it.age > 30 }.map (Person::name))
}

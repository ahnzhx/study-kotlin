package kotlinInAction.ch05



data class Person(val name: String, val age: Int)

val people= listOf(Person("Alice", 29),
    Person("Carol", 29), Person("Bob", 31))
val names = people.joinToString(" ") { p: Person -> p.name }

val list = listOf(1,2,3,4)


fun main(){
    println(people.maxByOrNull { it.age })
    println(people.maxByOrNull(Person::age))
    run{println(42)}
    println(names)
    println(list.map { it * it })
    println(people.map { it.name })

    println(people.filter { it.age > 30 }.map (Person::name))
    printProblemCounts(responses)
    println(people.groupBy{ it.age })


    people.map(Person::name).filter { it.startsWith("A") }

}

fun printProblemCounts(responses: Collection<String>){
    var clientError = 0
    var serverError = 0
    responses.forEach{
        if(it.startsWith("4")){
            clientError++
        }else if(it.startsWith("5")){
            serverError++
        }
    }
    println("$clientError client errors, $serverError server errors")
}

val responses = listOf("200 OK", "418 I'm a teapot", "500 Internal server Error")
package idioms

import java.io.Serializable
import java.time.Instant

data class Person (val name: String, val registered: Instant = Instant.now()){
    companion object{
        fun create(xml: String): Person{
            TODO("write an implementation creating "+ "a person from an xml string")
        }
    }
    fun test(){

    }

}

//Person.create("ss") 컴파일 에러
//class Member (name: String, registered: Instant) : Person(name, registered)

fun show(persons: List<Person>){
//    for(person in persons)
//        println(person.component1() + "'s registration date:" + person.component2()) 컴파일 에러
}


fun main(args: Array<String>){
    val persons = listOf(Person("mike"), Person("paul"))
    show(persons)
}




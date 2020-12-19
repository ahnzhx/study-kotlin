package byExample.functions

fun main(){
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye")

    val pair = "Ferrari" to "Katrina"
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia
    sophia.showLikedPeople() // print 가 안된다.
    Person("@22").showLikedPeople() // print가 안된다
}

// 여기 왜 print가 안되지?
class Person(val name: String){
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) {likedPeople.add(other)}

    fun showLikedPeople(){
        for(p in likedPeople){
            println(p)
        }
    }
}
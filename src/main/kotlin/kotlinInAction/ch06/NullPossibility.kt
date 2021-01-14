package kotlinInAction.ch06


fun<T> printHashCode1(t: T) = println(t?.hashCode()) // t는 null이 가능
fun<T: Any> printHashCode2(t: T) = println(t.hashCode()) // t는 null이 불가능

fun yellAt(person: PersonSample) = println(person.name.toUpperCase() + "!!!")
fun main(){
    yellAt(PersonSample(null))
}
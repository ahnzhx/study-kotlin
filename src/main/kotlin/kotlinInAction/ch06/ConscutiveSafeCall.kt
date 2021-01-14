package kotlinInAction.ch06

class Address(val streetAddress: String, val zipCode: Int,
                val city: String, val country: String)
class Company(val name: String, val address: Address?)
class Person(val name: String, val company: Company?)

fun Person.countryName(): String{
    return company?.address?.country ?: "Unknown"
}

fun foo(s: String?){
    val t : String = s ?: "" // s 가 null 이면 결과는 ""이다.
}
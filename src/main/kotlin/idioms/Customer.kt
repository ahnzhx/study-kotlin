package idioms

import java.io.File
import java.lang.IllegalStateException

data class Customer (val name

                     : String, val email: String)

fun main(){
    //foo()
    notNullShortHand()
}

fun foo(a: Int = 0, b:String=""){
    val list = listOf(1, 0, 2)
    val positives = list.filter{it > 0}
    println(positives)
}

fun notNullShortHand(){
    val files = File("test").listFiles()
    println(files?.size)
    // not null and else shorthand
    println(files?.size ?: "empty")

    val values = mapOf("name" to 1, "email" to 2)
    val email = values["email"] ?: throw IllegalStateException("email is missing")
    println(email)
}


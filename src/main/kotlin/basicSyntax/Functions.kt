package basicSyntax

import java.lang.Integer.parseInt

fun main(){
    println(maxOf(2,3))
    printProduct("1", "2")
}

//fun sum(a: Int, b: Int): Int{
//    return a + b
//}

fun sum(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int): Unit{
    println("sum of $a and $b is ${a+b}")
}

fun maxOf(a: Int, b: Int) = if(a > b) a else b

// Nullable values and null checks
fun printProduct(arg1: String, arg2: String){
    val x = parseInt(arg1)
    val y = parseInt(arg2)
//    if(x != null && y != null){
//        println(x * y)
//    } else {
//        println("'$arg1' or '$arg2' is not a number")
//    }

    if(x == null){
        println("Wrong number format in arg1: '$arg1'")
        return
    }
    if(y == null){
        println("Wrong number format in arg1: '$arg1'")
        return
    }
    println(x * y)
}



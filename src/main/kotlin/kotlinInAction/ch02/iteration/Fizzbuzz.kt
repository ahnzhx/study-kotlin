package kotlinInAction.ch02.iteration

fun fizzBuzz(i: Int) = when{
    i % 15 == 0 -> "Fizzbuzz"
    i % 3 == 0 -> "Fizz"
    i % 5 == 0 -> "Buzz"
    else -> "$i"
}

fun main(){
    // 1 ~ 100
    for(i in 1..100) {
        print(fizzBuzz(i) )
    }

    // 1 ~ 99
    for(i in 1 until 100) {
        print(fizzBuzz(i) )
    }

    for(i in 100 downTo 1 step 2) {
        print(fizzBuzz(i) )
    }
}

package kotlinInAction.ch02.iteration


// 소문자, 대문자 한번에 확인하는 방법은?
fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'

fun recognize(c: Char) = when(c){
    in '0'..'9' -> "It's a digit"
    in 'a'..'z', in 'A'..'Z' -> "It's a digit"
    else -> "I don't know"
}

fun main(){
    println(isLetter('q'))
    println(isNotDigit('x'))
    println(isNotDigit('3'))

    println(recognize('8'))
}

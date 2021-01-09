package kotlinInAction.ch05

import java.lang.StringBuilder

fun alphabetWithApply() = StringBuilder().apply{
        for(letter in 'A'..'Z'){
            append(letter)
        }
        append("\n Now I know the alphabet!")
    }.toString()

fun alphabetWithWith() = with(StringBuilder()){
    for(letter in 'A'..'Z'){
        append(letter)
    }
    append("\n Now I know the alphabet!")
    toString()
}

fun alphabet() = buildString{
    for(letter in 'A'..'Z'){
        append(letter)
    }
    append("\n Now I know the alphabet!")
}

fun main(){
    println(alphabetWithWith())
    println(alphabetWithApply())
    println(alphabet())
}
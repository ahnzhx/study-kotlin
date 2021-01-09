package kotlinInAction.ch05

import java.lang.StringBuilder

fun alphabet() = with(StringBuilder()){
        for(letter in 'A'..'Z'){
            append(letter)
        }
        append("\n Now I know the alphabet!")
        toString()
    }


fun main(){
    println(alphabet())
}
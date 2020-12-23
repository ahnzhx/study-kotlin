package kotlinInAction.ch03.collections

var opCount = 0

// java: static final
const val UNIX_LINE_SEPARATOR = "\n"

fun performOperation(){
    opCount++
}

fun reportOperationCount(){
    println("Operation performed $opCount times")
}
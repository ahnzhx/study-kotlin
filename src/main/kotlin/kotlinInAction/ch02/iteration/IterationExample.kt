package kotlinInAction.ch02.iteration

import java.util.*


fun mapTest(){
    val binaryReps = TreeMap<Char, String>()

    for(c in 'A'..'F'){
        val binary = Integer.toBinaryString(c.toInt())
        // c 를 키로 c의 2진 표현을 맵에 넣는다.
        binaryReps[c] = binary
    }

    // 맵에 대해 이터레이션. 맵의 키와 값을 두 변수에 각각 대입
    for ((key, value) in binaryReps){
        println("$key = $value")
    }
}

fun collectionTest(){
    val list = arrayListOf("10", "11", "1001")
    for ((index, element) in list.withIndex()){
        println("$index: $element")
    }
}

fun main(){
    mapTest()
    collectionTest()
}



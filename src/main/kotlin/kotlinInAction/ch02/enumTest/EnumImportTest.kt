package kotlinInAction.ch02.enumTest

import kotlinInAction.ch02.Color
import kotlinInAction.ch02.Color.*

fun getWarmth(color: Color) = when(color){
    RED, ORANGE, YELLOW -> "warm"
    GREEN, BLUE -> "cold"
}

/**
 * setOf : 인자로 전달받은 여러 객체를 그 객체들을 포함하는 집합인 set 객체로 만드는 함수
 *
 * 아래 함수의 단점: 자주 호출된다면 가비지 객체가 늘어난다.
 */
fun mix(c1: Color, c2: Color) = when(setOf(c1, c2)){
    setOf(RED, YELLOW) -> ORANGE
    setOf(YELLOW, BLUE) -> GREEN
    else -> throw Exception("I haven't seen this color")
}

// when에 아무 인자도 없으려면 각 분기의 조건이 boolean 결과를 계산하는 식이어야 함. 가독성이 떨어짐
fun mixOptimized(c1: Color, c2: Color) =
    when{
        (c1 == RED && c2 == YELLOW) ||
                (c1 == YELLOW && c2 == RED) -> ORANGE
        (c1 == BLUE && c2 == YELLOW) ||
                (c1 == YELLOW && c2 == BLUE) -> GREEN
        else -> throw Exception("I haven't seen this color")
    }
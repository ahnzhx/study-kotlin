package byExample.SpecialClasses

import java.util.*


class LuckDispatcher{
    fun getNumber(){
        var objRandom = Random()
        println(objRandom.nextInt(90))
    }
}

/**
 * Kotlin에는 object 키워드도 있습니다. 단일 구현으로 데이터 유형을 얻는 데 사용됩니다.
 * 아래의 객체 표현식은 자바의 익명 클래스와 같다.
 * 단일 객체를 생성하고 그 멤버를 선언한 뒤 하나의 함수 내에서 액세스 한다.
 */
fun rentPrice(standardDays: Int, festivityDays: Int,specialDays: Int): Unit {
    val dayRates = object{
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }
    val total = dayRates.standard + dayRates.festivity + dayRates.special

    print("total price : $$total")
}

fun main() {
    val d1 = LuckDispatcher()
    val d2 = LuckDispatcher()

    d1.getNumber()
    d2.getNumber()

    rentPrice(10,2,1)
}
package byExample.SpecialClasses

/**
 * 동반 객체
 * 이는 자바의 static 메소드와 구문이 비슷하다.
 * 클래스 이름을 한정자로 사용해 객체 멤버를 호출한다.
 * companion object보다 패키지 수준의 함수를 사용하는 것이 좋다.
 */
class BigBen{
    companion object Bonger {
        fun getBongs(nTimes: Int){
            for(i in 1..nTimes){
                print("BONG")
            }
        }
    }
}

fun main() {
    BigBen.getBongs(12)
}
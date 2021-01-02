package kotlinInAction.ch02.selectionExpression


interface Expr
// value 라는 프로퍼티만 존재하는 단순한 클래스. Expr 인터페이스를 구현한다.
class Num(val value: Int) : Expr
// Expr 타입의 객체라면 어떤 것이나 Sum 연산의 인자가 될 수 있다. 따라서 Num 이나 다른 Sum 이 인자로 올 수 있음.
class Sum(val left: Expr, val right: Expr) : Expr


fun main(){
    // 주소값 말고 7 이 나오도록 ?
    print(Sum(Sum(Num(1), Num(2)), Num(4)))
}

//if(e is Num)  -> e Num 으로 바뀌는데 (스마트 캐스팅) 스마트 캐스팅은 값을 만들어내는 건 아니다.

fun test(e: Expr): Int=
    when(e){
        is Num ->{
            println("num  ${e.value}")
            e.value

        }
        else -> throw IllegalArgumentException()
    }
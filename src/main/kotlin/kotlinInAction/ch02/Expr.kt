package kotlinInAction.ch02



interface Expr
// value 라는 프로퍼티만 존재하는 단순한 클래스. Expr 인터페이스를 구현한다.
class Num(val value: Int) : Expr
// Expr 타입의 객체라면 어떤 것이나 Sum 연산의 인자가 될 수 있다. 따라서 Num 이나 다른 Sum 이 인자로 올 수 있음.
class Sum(val left: Expr, val right: Expr) : Expr


fun main(){
    // 주소값 말고 7 이 나오도록 ?
    print(Sum(Sum(Num(1), Num(2)), Num(4)) to Int)
}
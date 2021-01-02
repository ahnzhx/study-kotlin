package kotlinInAction.ch04

class KotlinButton : View{
    override fun getCurrentState(): State = ButtonState()
    override fun restoreState(state: State){}

    class ButtonState: State{}
}

class Outer{

    // 내부 클래스 inner 안에서 바깥쪽 클래스 Outer 의 참조에 접근하기 위해서!
    inner class Inner{
        fun getOuterReference(): Outer = this@Outer
    }
}
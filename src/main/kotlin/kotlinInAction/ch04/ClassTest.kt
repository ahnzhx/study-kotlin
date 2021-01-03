package kotlinInAction.ch04

interface Focusable {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus.")
    fun showOff() = println("I'm focusable!")
}

interface Clickable{
    fun click()
    fun showOff() = println("I'm clickable")
}

class Button: Clickable, Focusable {
    override fun click() {
        println("I was clicked")
    }
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

open class RichButton: Clickable{
    fun disable(){} // final. 하위 클래스에서 메소드 오버라이드 불가능

    open fun animate(){} // 하위 클래스에서 이 메소드를 오버라이드 해도 된다.

    final override fun click() { // 상위 클래스에서 오버라이드 받은 메소드는 기본적으로 열려있다.
        TODO("Not yet implemented")
    }
}

 abstract class Animated{
     abstract fun animate() // 하위 클래스에서 반드시 오버라이드 해야함
     open fun stopAnimating(){} // 추상 클래스에 속했더라도 비추상 함수는 기본적으로 final이지만 open으로 오버라이드를 허용할 수 있다.
     fun animateTwice(){}
 }

internal open class TalkativeButton: Focusable{
    private fun yell() = println("Hey!!")
    protected fun whisper() = println("Let's talk.")
}

internal fun TalkativeButton.giveSpeech(){

}
fun main(){
    val btn =  Button()
    btn.showOff()
    btn.setFocus(true)
    btn.click()
}


open class Base(p : Int)
class Derived : Base(1)
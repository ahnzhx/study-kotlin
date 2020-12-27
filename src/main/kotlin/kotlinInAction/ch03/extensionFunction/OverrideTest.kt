package kotlinInAction.ch03.extensionFunction

open class View{
    open fun click() = println("view clicked")
}
class Button: View(){
    override fun click() = println("button clicked")
}
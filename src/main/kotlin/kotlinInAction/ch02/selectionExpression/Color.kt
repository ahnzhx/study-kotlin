package kotlinInAction.ch02.selectionExpression

enum class Color (val r: Int, val g: Int, val b: Int){
    RED(255, 0, 0),
    ORANGE(255, 166, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0,0,255);

    fun rgb() = ( r * 256 + g ) * 256 + b
}

fun main(){
    println("RED's rgb: " + Color.RED.rgb())
    print("Green's mnemonic: " + getMnemonic(Color.GREEN))

}

fun getMnemonic(color: Color)=
    when (color){
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLUE -> "Battle"
    }

fun getWarmth(color: Color)=
    when (color){
        Color.RED, Color.ORANGE, Color.YELLOW -> "warm"
        Color.GREEN, Color.BLUE -> "cold"
    }

package kotlinInAction.ch07

data class Point(val x: Int, val y: Int){
    override fun equals(other: Any?): Boolean {
        if(other === this) return true // this와 같은 객체인지 검사
        if(other !is Point) return false // 같은 타입인지 검사
        return other.x == x && other.y == y
    }
}
operator fun Point.plus(other: Point)
        = Point(x + other.x, y+other.y)

operator fun Point.times(scale: Double) =Point((x*scale).toInt(), (y * scale).toInt())

operator fun Char.times(count: Int) = toString().repeat(count)

operator fun Point.unaryMinus() = Point(-x, -y)

operator fun Point.get(index: Int): Int{
    return when(index){
        0 -> x
        1 -> y
        else -> throw IndexOutOfBoundsException("invalid coordinate $index")
    }
}

data class MutablePoint(var x: Int, var y: Int)
operator fun MutablePoint.set(index: Int, value: Int){
    when(index){
        0 -> x = value
        1 -> y = value
        else -> throw IndexOutOfBoundsException("invalid coordinate $index")
    }
}

fun main(){
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)
    println(p1+p2)

    println(p1 * 1.5)
    println('a' * 3)

    println(p1[1])
}
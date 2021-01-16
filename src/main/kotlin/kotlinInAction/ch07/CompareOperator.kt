package kotlinInAction.ch07

class Person(val firstName: String, val lastName: String): Comparable<Person>{
    override fun compareTo(other: Person): Int {
        return compareValuesBy(this, other, Person::firstName, Person::lastName)
    }
}

data class Rectangle(val upperLeft: Point, val lowerRight: Point)
operator fun Rectangle.contains(p: Point): Boolean{
    return p.x in upperLeft.x until lowerRight.x &&
            p.y in upperLeft.y until lowerRight.y
}

data class NameComponents(val name: String, val extension: String)
fun splitFilename(fullName: String): NameComponents {
    val (name, extension) = fullName.split('.', limit=2)
    return NameComponents(name, extension)
}

fun printEntries(map: Map<String, String>){
    for((key, value) in map){
        println("$key -> $value")
    }
}
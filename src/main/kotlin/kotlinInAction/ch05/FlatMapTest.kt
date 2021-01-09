package kotlinInAction.ch05


data class Book(val title: String, val authors: List<String>)
val books = listOf(Book("코틀린", listOf("안소현", "안주현")), Book("자바", listOf("안소현", "안정현")))

val strings = listOf("abc", "def")
fun main(){
    println(books.flatMap { it.authors }.toSet())
    println(listOf)
    println(strings.flatMap { it.toList() })
}

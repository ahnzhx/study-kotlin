package kotlinInAction.ch02.iteration

class ComparableTest(
    private val programmingLanguage: String
) : Comparable<String> {

    override fun compareTo(other: String) =
        this.programmingLanguage.compareTo(other)
}

fun main(){
    val ct1= ComparableTest("java")
    val ct2= ComparableTest("kotlin")
    val ct3= ComparableTest("scala")
    val ct4= ComparableTest("python")

    val ctList = listOf(ct1, ct2, ct3)

    println(ct4 in ctList)
    println("Kotlin" in "Java".."Scala")

}
package kotlinInAction.ch03.stringAndRegex

fun parsePath(path: String){
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")

    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")

    println("Dir: $directory, name: $fileName, ext: $extension")
}

fun parsePath2(path: String){
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if(matchResult != null){
        val (directory, fileName, extension) = matchResult.destructured
        println("Dir: $directory, name: $fileName, ext: $extension")
    }
}

val kotlinLogo = """| //
                   .| //
                   .|/ \ """.trimMargin(".")

val price = """${'$'}99.9"""

fun main(){
    parsePath("/Users/yole/kotlin-book/chapter.doc")
    parsePath2("/Users/yole/kotlin-book/chapter.doc")
    println(kotlinLogo)
    println("""/Users/yole/kotlin-book/chapter.doc""")
    println(price)
}
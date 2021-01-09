package kotlinInAction.ch05

fun main(){
    people.asSequence()
        .map(Person::name)
        .filter { it.startsWith("A") }
        .toList()

   val sequenceResult = listOf(1,2,3,4).asSequence()
        .map { print("map($it)"); it * it }
        .filter { print("filter($it)"); it%2 == 0 }
        .toList()

    println(sequenceResult)

    createAllDoneRunnable().run()
}

fun createAllDoneRunnable(): Runnable{
    return Runnable{ println("All done!")}
}

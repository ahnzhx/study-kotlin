package kotlinInAction.ch02

class PersonKotlin {
    fun test(){
        val person: Person = Person("sohyun")
        val personValue = person.name
        print(personValue)

        // setter가 없어서 에러난다
        // person.name = "another sohyun"

        val personWithMarried = Person("sonnie", false)
        personWithMarried.isMarried = true
        print(personWithMarried.isMarried)


    }
}
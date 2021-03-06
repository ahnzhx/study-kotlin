package kotlinInAction.ch11

class Greeter(val greeting: String){
    operator fun invoke(name: String){
        println("$greeting, $name")
    }
}

data class Issue(
    val id:String, val project: String, val type: String,
    val priority: String, val description: String
)

class ImportantIssuesPredicate(val project: String): (Issue) -> Boolean{
    override fun invoke(issue: Issue): Boolean {
        return issue.project == project && issue.isImportant()
    }

    private fun Issue.isImportant(): Boolean{
        return type == "Bug" &&
                (priority == "Major" || priority == "Critical")
    }
}

fun main() {
    val bavarianGreeter = Greeter("Servus")
    println(bavarianGreeter("Dimitry"))

    val i1 = Issue("IDEA-154446", "IDEA", "Bug", "Major", "Save settings failed")
    val i2 = Issue("IDEA-12183", "Kotlin", "Feature", "Normal", "Intention: Convert several calls on the same receiver to with/apply")

    val predicate = ImportantIssuesPredicate("IDEA")
    for(issue in listOf(i1, i2).filter(predicate)){
        println(issue.id)
    }
}
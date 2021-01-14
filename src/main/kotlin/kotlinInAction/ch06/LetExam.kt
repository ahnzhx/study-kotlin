package kotlinInAction.ch06

fun sendEmailTo(email: String) = println("sending email to $email")

val email: String? = "yole@example.com"

fun main(){
    email?.let{ sendEmailTo(it)}
}

///extended method
fun verifyUserInput(input: String?){
    if(input.isNullOrBlank()){
        println("please fill in the required fields")
    }
}
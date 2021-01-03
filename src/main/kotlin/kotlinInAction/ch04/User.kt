package kotlinInAction.ch04

class User3 constructor(val _nickname: String, val isSubscribed: Boolean = true)
class Secretive private constructor()

interface User{
    val email: String
    val nickname: String
        get() = email.substringBefore("@")
}

class SubscribingUser(val email3: String): User{
    override val email: String
        get() = TODO("Not yet implemented")
    override val nickname: String
        get() = email3.substringBefore("@")
}

class User2(val name: String){
    var address: String="unspecified"
        set(value: String){
            println("""
                Address was changed for $name:
                "$field" -> "$value".""".trimIndent())
            field = value  // 뒷밭침하는 필드 값 변경하기
        }
}

class LengthCounter{
    var counter: Int = 0
        private set
    fun addWord(word: String){
        counter += word.length
    }
}
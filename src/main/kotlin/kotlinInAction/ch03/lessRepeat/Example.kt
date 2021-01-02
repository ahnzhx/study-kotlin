package kotlinInAction.ch03.lessRepeat

import java.lang.IllegalArgumentException

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User){
    fun validate(user: User, value: String, fieldName: String){
        if(value.isEmpty()){
            throw IllegalArgumentException("Can't save user ${user.id}: empty $fieldName")
        }
    }
    validate(user, user.name, "Name")
    validate(user, user.address, "Address")
}

fun saveUser2(user: User){
    fun validate2(value: String, fieldName: String){
        if(value.isEmpty()){
            throw IllegalArgumentException("Can't save user ${user.id}: empty $fieldName")
        }
    }
    validate2(user.name, "Name")
    validate2(user.address, "Address")
}


fun User.validateBeforeSave(){
    fun validate(value: String, fieldName: String){
        if(value.isEmpty()){
            throw IllegalArgumentException("Can't save user $id: empty $fieldName")
        }
    }
    validate(name, "Name")
    validate(address, "Address")
}

fun saveUser3(user: User){
    user.validateBeforeSave()
}

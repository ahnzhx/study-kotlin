package kotlinInAction.ch07

import java.beans.PropertyChangeSupport
import java.lang.reflect.Type
import kotlin.reflect.KProperty

class Email
fun loadEmails(person: Korean): List<Email>{
    println("${person.name}의 이메일을 가져옴")
    return listOf()
}

//class Korean(val name: String){
//    private var _emails: List<Email>? = null
//    val emails: List<Email>
//        get() {
//            if (_emails == null){
//                _emails = loadEmails(this)
//            }
//            return _emails!! // 저장해 둔 데이터가 있으면 그 데이터를 반환한다.
//        }
//}



class ObservableProperty(
    var propValue: Int,
    val changeSupport: PropertyChangeSupport
){
    operator fun getValue(p: Korean, prop: KProperty<*>): Int = propValue
    operator fun setValue(p: Korean, prop: KProperty<*>, newValue: Int){
        val oldValue = propValue
        propValue = newValue
        changeSupport.firePropertyChange(prop.name, oldValue, newValue)
    }
}

class Korean {
    private val _attributes = hashMapOf<String, String>()
    fun setAttribute(attrName: String, value: String){
        _attributes[attrName] = value
    }

    val name: String by _attributes // 위임 프로퍼티로 맵 사용
}

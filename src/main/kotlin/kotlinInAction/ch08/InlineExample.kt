package kotlinInAction.ch08

import java.io.BufferedReader
import java.io.FileReader
import java.util.concurrent.locks.Lock

inline fun <T> synchronized(lock : Lock, action: () -> T): T{
    lock.lock()
    try {
        return action()
    }finally {
        lock.unlock()
    }
}

fun foo(l : Lock){
    println("before sync")
    synchronized(l){
        println("action")
    }
    println("after sync")
}

fun __foo__ (l : Lock){
    println("before sync")
    l.lock()
    try {
        println("action")
    }finally {
        l.unlock()
    }
    println("after sync")
}

class LockOwner(val lock: Lock){
    fun runUnderLock(body: () -> Unit){
        synchronized(lock, body)
    }
    fun __runUnderLock__(body:()->Unit){
        lock.lock()
        try {
            body()
        }finally {
            lock.unlock()
        }
    }
}

//fun <T, R> Sequence<T>.map(transform: (T) -> R) : Sequence<R> {
//    return TransformingSequence(this, transform)
//}

inline fun foo2(inlined: () -> Unit, noinline notInlined: () -> Unit){
    // ..
}

// 람다를 사용해 컬렉션 거르기
data class Person(val name: String, val age: Int)
val people = listOf(Person("Alice", 29), Person("Bob", 31))
fun main() {
    people.filter { it.age < 30 }
}

// use 함수를 자원 관리에 활용하기
fun readFirstLineFromFile(path: String): String{
    BufferedReader(FileReader(path)).use { br -> return br.readLine() }
}

fun lookForAlice(people: List<Person>){
    people.forEach{
        if(it.name == "Alice"){
            println("found!")
            return
        }
    }
    println("Alice is not found")
}

// return using label
fun lookForAlice2(people: List<Person>){
    people.forEach label@{
        if(it.name=="Alice") return@label // 앞에서 정의한 레이블을 참조한다.
    }
    println("Alice might be somewhere")
}

fun lookForAlice3(people: List<Person>){
    people.forEach {
        if(it.name=="Alice") return@forEach // 람다 식으로부터 반환시킨다.
    }
    println("Alice might be somewhere")
}

// 무명 함수
fun lookForAlice4(people: List<Person>){
    people.forEach(fun (person) {
        if(person.name == "Alice") return // return 은 가장 가까운 함수를 가리키는데 이 위치에서 사장 가까운 함수는 무명함수다.
        println("${person.name} is not Alice")
    })
}

// 식이 본문인 무명 함수 사용하기
fun noNameFun(){
    people.filter(fun (person) = person.age < 30)
}
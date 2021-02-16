package kotlinInAction.ch08

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
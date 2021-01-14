package kotlinInAction.ch03.extensionFunction

import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class MyService{
    fun performAction(): String = "foo"
}

class MyTest {
    private lateinit var myService: MyService
    @BeforeAll fun setUp() {
        myService = MyService() // setUp 메소드 안에서 진짜 초깃값을 지정한다.
    }
    @Test fun testAction(){
        assertEquals("foo", myService.performAction()) // 반드시 null 가능성을 신경써야 한다.
    }
}
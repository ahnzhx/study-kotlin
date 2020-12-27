package kotlinInAction.ch03.extensionFunction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExtensionWithJavaTest {
    @Test
    void test(){
        ExtensionWithJava extensionWithJava = new ExtensionWithJava();
        assertEquals('a', extensionWithJava.test());
    }

}
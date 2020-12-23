package kotlinInAction.ch03.collections;

import java.util.ArrayList;
import java.util.List;

public class KotlinAtJava {
    public void test(){
        List<Integer> list = new ArrayList<>();
        StringFunctions.joinToString2(list, ", ", "", "");
    }
}

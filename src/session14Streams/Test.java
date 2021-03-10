package session14Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.stream();
        System.out.println();
        method(1,2);


    }
    static void method(int... i){
        method2(i);

    }
    static void method2(int[] i){
        System.out.println("123");
    }
}

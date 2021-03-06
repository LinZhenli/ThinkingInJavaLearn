package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MapTest {
    static void method1(){
        Random random=new Random(47);
        Map<Integer,Integer> m=new HashMap<>();
        for (int i = 0; i < 10000; i++) {
            int r= random.nextInt(20);
            Integer freq=m.get(r);
            m.put(r,freq==null?1:freq+1);
        }
        System.out.println(m);
    }
    static void method2(){
        Random random=new Random(47);
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < 10000; i++) {
            int r= random.nextInt(20);
            map.put(r, map.containsKey(r)?map.get(r)+1:1);
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
       method2();
        System.out.println("----------");
        method1();


    }
}

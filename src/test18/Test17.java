package test18;

import util.TextFile;

import java.util.HashMap;
import java.util.Map;

public class Test17 {
    public static void main(String[] args) {
        Map<Character,Integer> charNumberMap=new HashMap<>();
        String s=TextFile.read("D:\\workspace\\ThinkingInJava\\src\\test18\\Test17.java" );
        long startTime1=System.nanoTime();
        for (char c:
        s.toCharArray()) {
            charNumberMap.put(c,charNumberMap.get(c)==null?1:charNumberMap.get(c)+1);
        }
        System.out.println("第一种时间"+(System.nanoTime()-startTime1));
        System.out.println(charNumberMap);

        long startTime2=System.nanoTime();
        Map<Character,Integer> charNumberMap2=new HashMap<>();

        for (char c:
                s.toCharArray()) {
            //charNumberMap.put(c,c1:charNumberMap.get(c)+1);
            if (charNumberMap2.get(c) == null) {
                charNumberMap.put(c, 1);
            } else {
                charNumberMap.put(c, charNumberMap.get(c) + 1);
            }

        }
        System.out.println("第二种时间"+(System.nanoTime()-startTime2));
        System.out.println(charNumberMap2);

    }
}

package session11HoldingYourObject;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();

        Map<Integer,String> map2=new HashMap<>();
        map.put(1,"hello");

        map2.put(2,"hello2");
       map.putAll(map2);
        System.out.println(map);
    }
}

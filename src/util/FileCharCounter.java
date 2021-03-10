package util;

import java.util.HashMap;
import java.util.Map;

public class FileCharCounter {
   public static void counterChar(String Filename){

        String s=TextFile.read(Filename );
        Map<Character,Integer> charNumberMap=new HashMap<>();
        for (char c:
                s.toCharArray()) {
            //charNumberMap.put(c,c1:charNumberMap.get(c)+1);
            if (charNumberMap.get(c) == null) {
                charNumberMap.put(c, 1);
            } else {
                charNumberMap.put(c, charNumberMap.get(c) + 1);
            }
        }
        System.out.println(charNumberMap);

    }
}

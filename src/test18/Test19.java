package test18;

import util.BinaryFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Test19 {
    public static void main(String[] args) throws IOException {
        byte[] data=BinaryFile.read("D:\\workspace\\ThinkingInJava\\src\\test18\\Test19.java");
        Map<Byte,Integer> byteCountMap=new HashMap<>();
        for (byte b:
                data) {
            //byteCountMap.put(c,c1:byteCountMap.get(c)+1);
            if (byteCountMap.get(b) == null) {
                byteCountMap.put(b, 1);
            } else {
                byteCountMap.put(b, byteCountMap.get(b) + 1);
            }
        }
        System.out.println(byteCountMap);

    }


}

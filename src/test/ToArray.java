package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ToArray {
    public static void main(String[] args) {
        String [] s= new String[]{
                "dog", "lazy", "a", "over", "jumps", "fox", "brown", "quick", "A"
        };
        List<String> list = Arrays.asList(s);
        Collections.reverse(list);
        s=list.toArray(new String[0]);//û��ָ�����͵Ļ��ᱨ��
        System.out.println(Arrays.toString(s));
    }
}

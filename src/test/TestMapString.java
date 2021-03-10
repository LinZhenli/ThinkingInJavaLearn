package test;


import java.util.HashSet;

import java.util.Set;

public class TestMapString {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        String s1="12";
        String s2=new String("12");

        set.add(s1);
        set.add(s2);
        System.out.println(s1==s2);
        System.out.println(set.size());
    }
}

package test;

import java.util.Arrays;

public class TestSplit {
    public static void main(String[] args) {
        String s="�й���wdվ����";
        System.out.println(Arrays.asList(s.split("\\w+")));
    }
}

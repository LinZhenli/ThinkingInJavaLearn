package test;

import java.util.Arrays;

public class TestSplit {
    public static void main(String[] args) {
        String s="中国人wd站起来";
        System.out.println(Arrays.asList(s.split("\\w+")));
    }
}

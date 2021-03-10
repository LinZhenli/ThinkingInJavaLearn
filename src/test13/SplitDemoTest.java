package test13;

import java.util.Arrays;
import java.util.regex.Pattern;

public class SplitDemoTest {
    public static void main(String[] args) {
        String input="This!!unusual use!!of exclamation!!points";
        System.out.println(Arrays.asList(input.split("!!")));
        //Only do the first three:
        System.out.println(Arrays.asList(input.split("!!",4)));
    }
}

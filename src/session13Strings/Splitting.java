package session13Strings;

import java.util.Arrays;

public class Splitting {
    public static String knights="then, when you have found the shrubbery, you must "+
            "cut down the mightiest tree in the forest... "+
            "with... a herring!";
    public static void split(String regex){
        System.out.println(
                Arrays.toString(knights.split(regex))
        );
    }

    public static void main(String[] args) {
        split(" ");
        split("\\W+");//Non-word
        split("n\\W+");//'n' followed by non-word characters

    }
}

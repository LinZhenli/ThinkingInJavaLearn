package test13;

import session13Strings.Splitting;

public class Test9 {
        public static String knights="then, when you have found the shrubbery, you must "+
            "cut down the mightiest tree in the forest... "+
            "with... a herring!";
    public static void main(String[] args) {
        System.out.println(knights.replaceAll("[aeiouAEIOU]","_"));
        System.out.println(knights.replace("you","me"));

    }
}

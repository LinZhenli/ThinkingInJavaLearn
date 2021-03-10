package session13Strings;

public class Replacing {
//    public static String knights="then, when you have found the shrubbery, you must "+
//            "cut down the mightiest tree in the forest... "+
//            "with... a herring!";
    static String s=Splitting.knights;

    public static void main(String[] args) {
        System.out.println(s.replaceFirst("f\\w+","located"));
        System.out.println(s.replaceAll("shrubbery|tree|herring","banana"));
    }
}

package test13;
/* Using the documentation for java.util.regex.Pattern as a resource,
 * write and test a regular expression that checks a sentence to see
 * that it begins with a captial letter and ends with a period.
 */
public class Test7 {
    public static void main(String[] args) {
        String regex="^[A-Z].*\\.$";
        String s="Hello world.";
        String s1="He";
        String s2="hs.";
        String s3="X.";

        System.out.println( s.matches(regex));
        System.out.println(s1.matches(regex));
        System.out.println(s2.matches(regex));
        System.out.println(s3.matches(regex));
    }
}

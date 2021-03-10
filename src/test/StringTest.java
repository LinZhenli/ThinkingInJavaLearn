package test;

public class StringTest {
    public static void main(String[] args) {
        String greeting = "HelloÄã‡Þ";
        int n = greeting.length();
        int cpCount = greeting.codePointCount(0, greeting.length());
        System.out.println(n);
        System.out.println(cpCount);

        char first = greeting.charAt(3); // first is 'H'
        char last = greeting.charAt(4); // last is ¡¯o
        System.out.println(first+""+last);

        int index = greeting.offsetByCodePoints(2,3);
        int cp = greeting.codePointAt(index);
        System.out.println(index);
        System.out.println(cp);
    }
}

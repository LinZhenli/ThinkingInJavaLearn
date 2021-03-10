package test;

public class StaticTest {
    private static int x=100;
    public static void main(String[] args) {
        StaticTest hs1=new StaticTest();
        hs1.x++;
        StaticTest.x--;
    }
}

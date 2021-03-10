package session13Functional;

public class TriFunctionTest {
    static int f(int i,long l,double b){return 99;}

    public static void main(String[] args) {
        TriFunction<Integer,Long,Double,Integer> tf= TriFunctionTest::f;
        tf=(i,l,d)->12;
    }
}

package test13;

public class Test6 {
    int i = 1;
    long l = 12;
    float f = 12.3f;
    double b = 13.4;

    @Override
    public String toString() {
        if (true)
            return String.format("%d,%d,%f,%f", i, l, f, b);
        else
            return String.format("%s,%s,%s,%s", i, l, f, b);
    }

    public static void main(String[] args) {
        System.out.println(new Test6());
    }
}

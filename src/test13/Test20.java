package test13;

import java.util.Scanner;

public class Test20 {
    int i;
    long l;
    float f;
    double d;
    String s;

    public static void main(String[] args) {
        Test20 ts=new Test20();
        String s="12 14 1.2 1.3 hello";
        Scanner sn=new Scanner(s);
        ts.i=sn.nextInt();
        ts.l=sn.nextLong();
        ts.f=sn.nextFloat();
       // ts.d=sn.nextDouble();
        ts.f=sn.nextFloat();
        ts.s=sn.next();
        System.out.println(ts);
    }

    @Override
    public String toString() {
        return "Test20{" +
                "i=" + i +
                ", l=" + l +
                ", f=" + f +
                ", d=" + d +
                ", s='" + s + '\'' +
                '}';
    }
}

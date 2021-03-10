package test;

public class IntTest {
    public static void main(String[] args) {
        int big = Integer.MAX_VALUE;
        System.out.println("big = " + big);//2147483647
       // int bigger = big * 4;
        int bigger = big +1;
        System.out.println("bigger = " + bigger);//-2147483648

        double d = 341_435_936.445_667;
        System.out.println(d);
        int bin = 0b0010_1111_1010_1111_1010_1111_1010_1111;
        System.out.println(Integer.toBinaryString(bin));
        System.out.printf("%x%n", bin); // [1]
        long hex = 0x7f_e9_b7_aa;
        System.out.printf("%x%n", hex);

        Integer i01 = 59;
        int i02 = 59;
        Integer i03 =Integer.valueOf(59);
        Integer i04 = new Integer(59);
        System.out.println(i03==i04);
    }

}

package test18;

public class TestB {
    public static void main(String[] args) {
        byte[] b= {-12,-14,-15};
        System.out.println(b[0]+" "+b[1]+" "+b[2]);
        byte[] c= {-12,-14,-15};
        System.out.println((c[0]&0xff)+" "+(c[1]&0xff)+" "+(c[2]&0xff));
    }
}

package test;

public class SuperTest {
    protected int number;
    static int moto;
    protected void showNumber() {
        System.out.println("number = " + number);
    }

    public static void main(String[] args) {
        Sub.moto=3;
        System.out.println(Sub.moto);
        new Sub().bar();
        new Sub().showNumber();
    }
}


class Sub extends SuperTest {

    void bar() {
        super.number = 10;
        super.showNumber();
    }


}

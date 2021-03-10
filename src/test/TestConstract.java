package test;

public class TestConstract extends A{
    TestConstract(){
        System.out.println("TestConstract");
    }

    public static void main(String[] args) {
        new TestConstract();
    }

}

class A{
    protected class Yolk{
        public Yolk() {System.out.println("Egg2.Yolk()");}
        public void f() {System.out.println("Egg2.Yolk.f()");}
    }
    A(){
        System.out.println("A");
    }
}
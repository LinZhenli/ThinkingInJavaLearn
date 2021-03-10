package session9Interfaces;

public class Implementation3 implements  InterfaceWithDefault{
    @Override
    public void firstMethod() {
        System.out.println("firstMethod");
    }

    @Override
    public void secondMethod() {
        System.out.println("secondMethod");
    }

    public static void main(String[] args) {
        InterfaceWithDefault i=new Implementation3();
        i.firstMethod();
        i.secondMethod();
        i.newMethod();
    }
}

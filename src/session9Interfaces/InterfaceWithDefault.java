package session9Interfaces;

public interface InterfaceWithDefault {
    void firstMethod();
    void secondMethod();
    default  void newMethod(){
        System.out.println("newMethod");
    }
}

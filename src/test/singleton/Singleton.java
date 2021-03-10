package test.singleton;

public class Singleton {
    private volatile static Singleton singleton;
    private Singleton(){}
    Singleton getSingleton(){
        if (singleton==null){
            synchronized (this) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}

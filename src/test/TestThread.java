package test;

public class TestThread {
    public static void main(String[] args) {
        new AT().start();
    }
}

class AT extends Thread{
    @Override
    public void run() {
        System.out.println("hello");
    }
}
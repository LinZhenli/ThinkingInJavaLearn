package test.proxy;


public class HelloProxy implements HelloInterface{
    private HelloInterface helloInterface=new Hello();
    @Override
    public String sayHello() {
        System.out.println("Before invoke sayHello");
        helloInterface.sayHello();
        System.out.println("Ager invoke sayHello");
        return  "hello";
    }

    public static void main(String[] args) {
        HelloProxy helloProxy=new HelloProxy();
        helloProxy.sayHello();
    }
}

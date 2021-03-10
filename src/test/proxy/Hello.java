package test.proxy;

public class Hello implements HelloInterface{
    @Override
    public String sayHello() {
        System.out.println("Hello zhanghao!");
        return "hello";
    }
}

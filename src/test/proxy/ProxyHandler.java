package test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理示例
 * 代理类用继承InvocationHandler
 */
public class ProxyHandler implements InvocationHandler {
    private Object object;

    public ProxyHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before invoke " + method.getName());
        method.invoke(object, args);
        System.out.println("After invoke " + method.getName());
        return null;
    }

    public static void main(String[] args) {
        ByeInterface bye = new Bye();
        HelloInterface hello = new Hello();
        InvocationHandler handler = new ProxyHandler(hello);
       // InvocationHandler handler2 = new ProxyHandler(bye);
        HelloInterface proxyHello = (HelloInterface) Proxy.newProxyInstance
                ( HelloInterface.class.getClassLoader(), new Class[]{HelloInterface.class}, handler);
        String s= proxyHello.sayHello();
        System.out.println(s);
    }
}

package test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestProxy implements InvocationHandler {
    Object object;
    TestProxy(Object object){
        this.object=object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        method.invoke(object,args);
        return null;
    }

    public static void main(String[] args) {
        ByeInterface bye=(ByeInterface)Proxy.newProxyInstance(ByeInterface.class.getClassLoader(),
                new Class[]{ByeInterface.class},new TestProxy(new Bye()));
        bye.sayBye();
    }
}

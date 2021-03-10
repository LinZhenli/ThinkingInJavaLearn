package test14;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;


class DynamicProxyHandler implements InvocationHandler{
	private Object proxied;
	public DynamicProxyHandler(Object proxied) {
		this.proxied=proxied;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		long timeIn = new Date().getTime();
		System.out.println("**** proxy: "+proxy.getClass()+",method: "+method+",args:"+args
				+",invoked at "+timeIn + " on " + (new Date()));
		if(args!=null)
			for(Object arg:args)
				System.out.println(" "+arg);
		return method.invoke(proxied, args);
	}
	
}
public class SimpleDynamicProxyDemo22 {
	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.somethingElse("bonobo");
	}
	public static void main(String[] args) {
		RealObject real=new RealObject();
		consumer(real);
		//Insert a proxy and call again:
		Interface proxy=(Interface)Proxy.newProxyInstance(Interface.class.getClassLoader(),
				new Class[] {Interface.class}, new DynamicProxyHandler(real));
		System.out.println("-----------------");
		consumer(proxy);
	}

}
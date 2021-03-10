package session14TypeInformation;
//Looking for particular methods in a dynamic proxy.

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class MethodSelector implements  InvocationHandler{
	private Object proxied;
	public MethodSelector(Object proxied) {
		this.proxied=proxied;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if(method.getName().equals("interestring"))
			System.out.println("Proxy detected the  interesting method");
		return method.invoke(proxied, args);
	}
}

interface SomeMethods{
	void boring1();
	void boring2();
	void interestring(String arg);
	void boring3();
}

class Implementation implements SomeMethods{

	@Override
	public void boring1() {
		System.out.println("boring1");
	}

	@Override
	public void boring2() {
		System.out.println("boring2");
	}

	@Override
	public void interestring(String arg) {
		System.out.println("interesting "+arg);
		
	}

	@Override
	public void boring3() {
		System.out.println("boring3");
	}
	
}
public class SelectingMethods {

	public static void main(String[] args) {
		SomeMethods proxy=(SomeMethods)Proxy.newProxyInstance(SomeMethods.class.getClassLoader(),
				new Class[] {SomeMethods.class}, new MethodSelector(new Implementation()));
		proxy.boring1();
		System.out.println(proxy);
		proxy.boring2();
		proxy.interestring("bonobo");
		proxy.boring3();
	}

}

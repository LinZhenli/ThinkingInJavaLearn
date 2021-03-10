package session14TypeInformation;

interface Interface{
	void doSomthing();
	void somethingElse(String arg);
}

class RealObject implements Interface{

	@Override
	public void doSomthing() {
		System.out.println("doSomthing");
		
	}

	@Override
	public void somethingElse(String arg) {
		System.out.println("somethingElse "+ arg);
	}
	
}

class SimpleProxy implements Interface{
	private Interface proxied;
	public SimpleProxy(Interface proxied) {
		this.proxied=proxied;
	}
	@Override
	public void doSomthing() {
		System.out.println("SimpleProxy doSomething");
		proxied.doSomthing();
	}

	@Override
	public void somethingElse(String arg) {
		System.out.println("SimpleProxy somethingElse "+ arg);
		proxied.somethingElse(arg);
	}
	
}
public class SimpleProxyDemo {
	public static void consumer(Interface iface) {
		iface.doSomthing();
		iface.somethingElse("bonobo");
	}
	public static void main(String[] args) {
		consumer(new RealObject());
		consumer(new SimpleProxy(new RealObject()));

	}

}

package session9Interfaces;

interface Service{
	void method1();
	void method2();
}

interface ServiceFactory{
	Service getService();
}

class Implementation1 implements Service{
	Implementation1(){}//Package access
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Implementation1 method1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Implementation1 method2");
	}
}

class Implementation1Factory implements ServiceFactory{

	@Override
	public Service getService() {
		// TODO Auto-generated method stub
		return new  Implementation1();
	}
}

class Implementation2 implements Service{
	Implementation2(){}//Package access
	@Override
	public void method1() {
		System.out.println("Implementation2 method1");
	}

	@Override
	public void method2() {
		System.out.println("Implementation2 method2");
	}
	
}

class Implementation2Factory implements ServiceFactory{

	@Override
	public Service getService() {
		// TODO Auto-generated method stub
		return new Implementation2();
	}
}

public class Factories {
	public static void serviceConsumer(ServiceFactory fact) {
		Service s=fact.getService();
		s.method1();
		s.method2();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		serviceConsumer(new Implementation1Factory());
		//Implementations are completely interchangeable:
		serviceConsumer(new Implementation2Factory());	
	}
}

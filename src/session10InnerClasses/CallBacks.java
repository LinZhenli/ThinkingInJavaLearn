package session10InnerClasses;
//Using inner classes for callbacks
interface Incrementable{
	void increment();
}

//Very simple to just implement the interface:
class Callee1 implements Incrementable{
	private int i=0;
	@Override
	public void increment() {
		// TODO Auto-generated method stub
		i++;
		System.out.println(i);
	}
}

class MyIncrement{
	public void increment() {
		System.out.println("Other operation");
	}
	
	static void f(MyIncrement mi) {mi.increment();};
}

//If your class must implement increment() in 
//some other way, you must use an inner class:
class Callee2 extends MyIncrement{
	private int i=0;
	@Override
	public void increment() {
		super.increment();
		i++;
		System.out.println(i);
	}
	
	private class Closure implements Incrementable{

		@Override
		public void increment() {
			//Specify outer-class method,otherwise
			//you'd get an infinite recursion:
			Callee2.this.increment();
		}
	}
	Incrementable getCallbackReference() {
		return new Closure();
	}
}

class Caller{
	private Incrementable callbackReference;
	Caller(Incrementable cbh){callbackReference=cbh;}
	void go() {callbackReference.increment();}
}

public class CallBacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Callee1 c1=new Callee1();
		Callee2 c2=new Callee2();
		MyIncrement.f(c2);
		Caller caller1=new Caller(c1);
		Caller caller2=new Caller(c2.getCallbackReference());
		caller1.go();
		caller1.go();
//		caller2.go();
//		caller2.go();
	}

}

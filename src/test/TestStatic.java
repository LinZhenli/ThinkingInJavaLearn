package test;

public class TestStatic extends StatiMethod{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StatiMethod sm=new TestStatic();
		sm.method();
		//!method3();
	}
	
	static void method() {
		System.out.println("hello2");
	}
	void method3() {
		System.out.println("method3");
	}

}

class StatiMethod{
	static void method() {
		System.out.println("hello");
	}
	
}
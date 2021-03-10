package test8;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b=new SubClass();
		b.method1();
	}

}

class Base{
	void method1(){method2();}
	void method2(){System.out.println("This is Base!");}
}

class SubClass extends Base{

	
	@Override
	void method2() {
		System.out.println("This is SubClass!");
	}
	
}
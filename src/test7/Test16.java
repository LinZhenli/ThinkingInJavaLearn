package test7;

public class Test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frog frog=new Frog();
		use(frog);
		
	}
	
	static void use(Amphibian amp) {
		amp.method1();
		amp.method2();
	}
}

class Amphibian{
	
	void method1(){}
	void method2(){}
}


class Frog extends Amphibian{
	void method1(){System.out.println("frog.method1()");}
	void method2(){System.out.println("frog.method2()");}
}
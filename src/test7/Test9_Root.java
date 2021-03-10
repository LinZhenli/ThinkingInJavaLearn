package test7;

public class Test9_Root {
	Component1 cmp1=new Component1();
	Component2 cmp2=new Component2();
	Component3 cmp3=new Component3();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	void dispose() {
		
	}

}

class Component1 {
	Component1() {
		System.out.println("Component1");
	}

	void dispose() {

	}
}

class Component2 {
	Component2() {
		System.out.println("Component2");
	}

	void dispose() {

	}
}

class Component3 {
	Component3() {
		System.out.println("Component3");
	}

	void dispose() {

	}
}
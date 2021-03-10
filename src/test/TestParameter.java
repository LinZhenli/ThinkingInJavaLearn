package test;

public class TestParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method(new increamer());
	}

	static void method(increamer m) {
		m.outputn();
	}
}

class increamer{
	static void outputn() {
		System.out.println("we");
	}
}



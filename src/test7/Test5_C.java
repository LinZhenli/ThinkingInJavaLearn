package test7;

public class Test5_C extends Test5_A{
	
	static Test5_B tb=new Test5_B(5);
	//Test5_B tb=new Test5_B();
	Test5_C(int i){
		super(i);
		System.out.println("C ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test5_C(3);
	}

}

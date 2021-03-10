package test10;

public class Test7 {
	private int a=1;
	private void method(){
		
	}
	class Inner{
		void method2(){
			a++;
			method();
		}
	}
	void printa(){
		System.out.println(a);
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test7 t=new Test7();
		Inner in=t.new Inner();
		Inner in2=t.new Inner();
		in.method2();
		in2.method2();
		t.printa();
		
	}

}

package test10;

public class Test8 {
	void useI() {
		System.out.println(new Inner().a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test8().useI();
	}
	class Inner{
		private int a=0;
	}
}

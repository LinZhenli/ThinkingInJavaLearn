package test10;

public class Outer {
	private String st="hij";
	class Inner{
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return st;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Inner in=new Outer().getInner();
		System.out.println(in);
	}
	Inner getInner(){
		return new Inner();
	}
}

package session10InnerClasses;
//Qualifying access to the outer-class object.
public class DotThis {
	void f() {System.out.println("DotThis.f()");}
	public class Inner{
		public DotThis outer() {
			return DotThis.this;
			//A plain "this" would be Inner's "this"
		}
	}
	
	public Inner inner() {return new Inner();}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DotThis dt=new DotThis();
		DotThis.Inner dti=dt.inner();
		DotThis dt2=dti.outer();
		System.out.println(dt==dt2);
	}
}

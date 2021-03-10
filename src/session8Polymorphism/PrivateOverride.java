package session8Polymorphism;
//Trying to override a private method.
public class PrivateOverride {
	private void f() {System.out.println("private()");}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateOverride po=new Derived();
		po.f();
	}

}

class Derived extends PrivateOverride{
	public void f() {
		System.out.println("public f()");
	}
}
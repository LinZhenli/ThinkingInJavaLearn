package session8Polymorphism;

//Downcasting &Runtime type information RTTI

class Useful{
	public void f() {}
	public void g() {}
}

class MoreUseful extends Useful{
	public void f() {}
	public void g() {}
	public void u() {
		System.out.println("u()");
	}
	public void v() {}
	public void w() {}
}
public class RttI{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Useful[]x= {new Useful(),new MoreUseful()};
		x[0].f();
		x[1].g();
		//!x[1].u();
		((MoreUseful)x[1]).u();
	}

}

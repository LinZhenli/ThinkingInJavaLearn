package session7ReusingClasses;
//It only looks like you can override
//a private or private final method.
class WithFinals{
	//Identical to "private" alone:
	private final void f() {System.out.println("WithFinals.f()");}
	//Also automatically "final":
	private void g() {System.out.println("WithFinals.g()");}
	
}

class OverringPrivate extends WithFinals{
	private final  void f() {
		System.out.println("OverridingPrivate.f()");
	}
	private void g() {
		System.out.println("OverridingPrivate.g()");
	}
	void ff() {
		f();
	}
	public void gg() {
		f();
	}
}

class OverringPrivate2 extends OverringPrivate{
	public final  void f() {
		System.out.println("OverridingPrivate2.f()");
	}
	public void g() {
		System.out.println("OverridingPrivate2.g()");
	}
	@Override
	public void ff() {
		g();
	}

	
}
public class FinalOverridingIllusion {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverringPrivate2 op2=new OverringPrivate2();
		op2.f();
		op2.g();
		op2.gg();
		//You can upcast:
		OverringPrivate op=op2;
		//But you can't call the methods:
		//!op.f();
		//!op.g();
		//Same here:
		WithFinals wf=op2;
		//!wf.f();
		//!wf.g();
	}

}

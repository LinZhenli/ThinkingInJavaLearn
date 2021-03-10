package session10InnerClasses;
abstract class Base{
	public Base(int i) {
		System.out.println("Base constructor,i="+i);
	}
	public abstract void f();
}

public class AnonymousConstructor {
	public static Base getBase(int i) {
		return new Base(i) {
			{System.out.println("Inside instance initializer");}
			@Override
			public void f() {
				// TODO Auto-generated method stub
				System.out.println("In anonymous f()");
			}
		};
	}
	static int i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base=getBase(i);
		base.f();
	}

}

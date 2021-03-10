package session9Interfaces.nesting;

class A{
	interface B{
		void f();
	}
	public class BImp implements B{
		public void f() {}
	}
	private class BImp2 implements B{
		public void f() {}
	}
	public interface C{
		void f();
	}
	class CImp implements C{
		public void f() {
			
		}
	}
	private class CImp2 implements C{
		public void f() {
		}
	}
	private interface D{
		void f();
	}
	
	private class DImp implements D{
		public void f() {}
	}
	
	public class DImp2 implements D{
		public void f() {}
	}
	public D getD() {return new DImp2();}
	private D dRef;
	public void receiveD(D d) {
		dRef=d;
		dRef.f();
	}
}

interface E{
	interface G{
		void f();
	}
	//Redundant "public":
	public interface H{
		void f();
	}
	void g();
	//Cannot be private within an interface:
	//!private interface I{}
}
public class NestingInterfaces {
	public class BImp implements A.B{
		public void f() {}
	}
	class CImp implements A.C{
		public void f() {}
	}
	//Cannot implement a private interface except
	//within that interface's defining class:
//!	class DImp implements A.D{
//!		public void f() {}
//!	}
	class EImp implements E{

		@Override
		public void g() {
			// TODO Auto-generated method stub
		}		
	}
	
	class EImp2 implements E{
		public void g() {}
		class EG implements E.G{
			@Override
			public void f() {
				// TODO Auto-generated method stub
				
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		//Can't access A.D:
		//!A.D AD=a.getD();
		//Doesn't return anything but A.D:
		//!A.DImp2 di2=a.getD();
		A.DImp2 di3=new A().new DImp2();
		//Cannot access a member of the interface:
		//!a.getD().f();
		//Only another A can do anything with getD():
		A a2=new A();
		a2.receiveD(a.getD());//因为和D是在同一个类中的，所以能引用到私有类。
	}

}

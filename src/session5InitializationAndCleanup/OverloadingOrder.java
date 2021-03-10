package session5InitializationAndCleanup;
//Overloading based on the order of the arguments.
public class OverloadingOrder {
	static void f(String s, int i) {
		System.out.println("String: " +s+",int:"+i);
	}
	static void f( int i,String s) {
		System.out.println("int:" +s+",String: "+i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f("String first",11);
		f(99,"Int first");
	}

}

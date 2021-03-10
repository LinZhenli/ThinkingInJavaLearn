package session5InitializationAndCleanup;

public class OptionalTrailingArguments {
	static void f(int required,String... traling) {
		System.out.println("required,String... trailing");
		System.out.println("required: "+required+" ");
		for (String string : traling) {
			System.out.println(string+" ");
		}
		System.out.println();
	}
	//The variable argument type String of the method f2 must be the last parameter
//	static void f2(String...h,int b) {
//		
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(1,"one");
		f(2,"two","three");
		f(0);
	}

}

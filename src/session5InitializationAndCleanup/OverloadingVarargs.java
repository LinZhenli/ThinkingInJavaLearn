package session5InitializationAndCleanup;

public class OverloadingVarargs {
	static void f(Character...characters) {
		System.out.println("first");
		for (Character character : characters) {
			System.out.println(" "+character);
		}
		System.out.println();
	}
	static void f(Integer...characters) {
		System.out.println("second");
		for (Integer character : characters) {
			System.out.println(" "+character);
		}
		System.out.println();
	}
	static void f(Long...args) {
		System.out.println("third");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f('a','b','c');
		f(1);
		f(2,1);
		f(0);
		f(0L);
		//!f();
	}

}

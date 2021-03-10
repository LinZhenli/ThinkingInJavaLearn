package session5InitializationAndCleanup;

//Promotion of primitives and overloading

public class PrimitiveOverloading {

	static void f1(char x) {System.out.println("f1(char)");System.out.println(x);}

	static void f1(byte x) {System.out.println("f1(byte)");}

	static void f1(short x) {System.out.println("f1(short)");}

	static void f1(int x) {System.out.println("f1(int)");}

	static void f1(long x) {System.out.println("f1(long)");}



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		//f1((byte)'a');
		f1('a');

	}

}


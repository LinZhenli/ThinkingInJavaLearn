package session5InitializationAndCleanup;

public class VarargType {
	static void f(Character... args) {
		System.out.println(args.getClass());
		System.out.println("length "+args.length);
	}
	
	static void g(int...args) {
		System.out.println(args.getClass());
		System.out.println(" length "+args.length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f('a');
		f();
		g(1);
		g();
		System.out.println("int[]: "+ new int[0].getClass());
	}

}

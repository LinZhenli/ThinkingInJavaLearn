package session5InitializationAndCleanup;

//{CompileTimeError}(Won't compile)
public class OverloadingVarargs2 {
	static void f(float i,Character... args) {
		System.out.println("first");
	}
	static void f(Character... args) {
		System.out.println("first");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(1,'a');
		//!f('a','b');
	}

}

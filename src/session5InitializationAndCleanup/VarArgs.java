package session5InitializationAndCleanup;
//Using array syntax to create variable argument lists.
class A{}

public class VarArgs {
	static void printArray(Object[] args) {
		for(Object obj:args)
			System.out.println(obj+" ");
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printArray(new Object[] {"one","two","three"});
		printArray(new Object[] {new A(),new A(),new A()});

	}

}

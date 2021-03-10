package session5InitializationAndCleanup;
//Using array syntax to create variable argument lists.
public class NewVarArgs {
	static void printArray(Object... args) {
		for (Object object : args) {
			System.out.println(object+"");	
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Can take individual elements:
		printArray(new Integer(47),new Float(3.14),new Double(11.11));
		printArray(47,3.14F,11.11);
		printArray("one","two","three");
		printArray(new A(),new A(),new A());
		//Or an array:
		printArray((Object[])new Integer[] {1,2,3,4});
		printArray();//Empty list is OK
		printArray("1",new A());
		
	}

}

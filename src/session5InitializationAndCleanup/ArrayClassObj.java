package session5InitializationAndCleanup;
import java.util.Arrays;
//Creating an array of nonprimitive objects.
import java.util.Random;

public class ArrayClassObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random(47);
		Integer[]a=new Integer[rand.nextInt(20)];
		System.out.println("length of a= "+a.length);
		for(int i=0;i<a.length;i++)
			a[i]=rand.nextInt(500);
		System.out.println(Arrays.toString(a));
	}

}

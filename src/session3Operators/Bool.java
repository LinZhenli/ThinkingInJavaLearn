package session3Operators;
//Relational and logical operators.
import static util.Print.*;
import java.util.Random;

public class Bool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random(47);
		int i= rand.nextInt(100);
		int j= rand.nextInt(100);
		println("i="+i);
		println("j="+j);
		println("i>j is "+(i>j));
		//Treating an int as a boolean is not legal Java:
		//! println("i&&j is"+(i&&j));
		
	}

}

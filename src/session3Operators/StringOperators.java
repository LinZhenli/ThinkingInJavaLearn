package session3Operators;

public class StringOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0,y=1,z=2;
		String s="x,y,z";
		System.out.println(s+x+y+z);
		System.out.println(x+" "+s);//Converts to a String
		s+="(summed)= ";//Concatenation operator
		System.out.println(s+(x+y+z));
		System.out.println(""+x);//Shorthand for Integer.toString()
	}
}

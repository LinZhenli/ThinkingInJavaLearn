package session3Operators;
//"e"means "10" to the power

public class Exponents {

	public static void main(String[] args) {
		// Uppercase and lowercase "e" are the same:
		float expFloat=1.39e-43f;
		expFloat=1.39E-43f;
		System.out.println(expFloat);
		double expDouble=47e47d;
		System.out.println(expDouble);
		int i=(int) 2e3;
		System.out.println(i);
		System.out.println(Double.MAX_VALUE);
		
		System.out.println(Math.pow(3, 10));
	}

}

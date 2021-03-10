package session3Operators;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=200;
		long lng=(long)i;
		lng=i;//"Widening."so cast not really required
		long lng2=(long)200;
		lng2=200;
		//A "narrowing conversion":
		i=(int)lng2;//cast required
		long lng3=(long) 6e10;
		System.out.println("lng3: "+lng3);
		int i3=(int)lng3;
		System.out.println(i3);
	}

}

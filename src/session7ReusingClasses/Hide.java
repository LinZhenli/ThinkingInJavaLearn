package session7ReusingClasses;
//Overloading a base-class method name in a derived
//class does not hide the base-class versions.

class Homer{
	char doh(char c) {
		System.out.println("doh(char)");
		return 'd';
	}
	float doh(float f) {
		System.out.println("doh(float)");
		return 1.0f;
	}
}

class Milhouse{}

class Bart extends Homer{
	void doh(Milhouse m) {
		System.out.println("doh(Milhouse)");
	}
}

//class Lisa extends Homer{
//	@Override
//	float doh(Milhouse m) {
//		System.out.println("doh(Milhouse)");
//		return m;
//	}
//}
public class Hide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bart b=new Bart();
		b.doh(1);
		b.doh('x');
		b.doh(1.0f);
		b.doh(new Milhouse());
	}

}

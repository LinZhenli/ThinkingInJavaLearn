package session6AccessControl;
//Demonstrates "private" keyword.

class Sundae{
	private Sundae() {}//私有的构造器
	static Sundae makeASundae() {
		return new Sundae();
	}
}
public class IceCream {
	public static void main(String[] args) {
		//!Sundae x=new Sundae();
		Sundae x=Sundae.makeASundae();
	}
}

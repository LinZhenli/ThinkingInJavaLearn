package session6AccessControl;
//Demonstrates "private" keyword.

class Sundae{
	private Sundae() {}//˽�еĹ�����
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

package session6AccessControl;

import session6AccessControl.dessert.Cookie;

public class ChocolateChip2 extends Cookie{
	public ChocolateChip2() {
		System.out.println("ChocolateChip2 constructor");
	}
	public void chomp() {bite();}//protected method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChocolateChip2 x=new ChocolateChip2();
		x.chomp();
	}

}

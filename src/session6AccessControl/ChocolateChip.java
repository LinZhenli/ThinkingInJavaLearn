package session6AccessControl;
//Can't use package-access member from another package.

import session6AccessControl.dessert.Cookie;

public class ChocolateChip extends Cookie{
	public ChocolateChip() {
		System.out.println("ChocolateChip constructor");
	}
	public void chomp() {
		//!bite();//Can't access bite
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChocolateChip x=new ChocolateChip();
		x.chomp();
	}

}

package test6;

import session6AccessControl.dessert.Cookie;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cookie cook=new Cookie();
		//!cook.bite();//包外的，不具备访问权限
		new Test1().test4Method();
	}

}

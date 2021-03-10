package test7;

import session7ReusingClasses.Detergent;

public class Test2 extends Detergent{
	public void scrub() {
		append(" Test2.scrub()");
		super.scrub();//Call base-class version
	}
	public void sterilize() {
		append(" sterilize");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test2 x=new Test2();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		x.sterilize();
		System.out.println(x);
		System.out.println("Testing base class:");
		Detergent.main(args);
	}

}

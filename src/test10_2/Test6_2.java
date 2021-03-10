package test10_2;


import test10.Test6;
import test10_1.Test6_1;

public class Test6_2 extends Test6_1{
	Test6 method() {
		return new Inner();
	}
	public static void main(String[] args) {
		Test6_2 ts=new Test6_2();
		System.out.println(ts.method());
	}
}

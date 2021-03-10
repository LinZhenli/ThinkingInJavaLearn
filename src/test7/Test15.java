package test7;

import session7ReusingClasses.Orc;

public class Test15 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		He he=new He("hello", 2);
		System.out.println(he);
		//!orc.set("");
	}

}

class He extends Orc{

	public He(String name, int orcNumber) {
		super(name, orcNumber);
		// TODO Auto-generated constructor stub
		//set("");
		set("Lin");
		//System.out.println(super.toString());
	}
	
	
}

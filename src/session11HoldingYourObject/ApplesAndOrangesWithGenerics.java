package session11HoldingYourObject;

import java.util.ArrayList;


public class ApplesAndOrangesWithGenerics {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Apple> apples=new ArrayList();
		for(int i=0;i<3;i++)
			apples.add(new Apple());
		//Compile-time error:
	//!	apples.add(new Orange());
		for(int i=0;i<apples.size();i++)
			System.out.println(apples.get(i).id());
		
		//Using foreach:
		for (Apple apple : apples) {
			System.out.println(apple.id());
		}
	}
}

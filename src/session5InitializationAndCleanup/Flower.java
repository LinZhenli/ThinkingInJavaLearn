package session5InitializationAndCleanup;
//Calling constructors with "this"
public class Flower {
	int petalCount=0;
	String s="inital value";
	Flower(int  petals){
		petalCount=petals;
		System.out.println("Counstructor w/ int arg only,petalCount= "+petalCount);
	}
	
	Flower(String s,int petals){
		this(petals);
		//! this(s); //Can not call two!
		this.s=s;//Another use of "this"
		System.out.println("String & int args");
	}
	
	Flower(){
		this("hi",47);
		System.out.println("default constructor (no args)");
	}
	
	void printPetalCount() {
		//!this(11);
		System.out.println("petalCount= "+petalCount +" s="+s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flower x=new Flower();
		x.printPetalCount();
	}

}

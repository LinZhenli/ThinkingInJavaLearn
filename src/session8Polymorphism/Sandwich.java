package session8Polymorphism;

interface FastFood{
	
}
class Meal implements FastFood{
	Meal(){System.out.println("Meal");}
}

class Bread{
	Bread(){System.out.println("Bread");}
}

class Cheese{
	Cheese(){System.out.println("Cheese");}
}

class Lettuce{
	Lettuce(){System.out.println("Lettuce");}
}

class Lunch extends Meal{
	Lunch(){System.out.println("Lunch");}
}

class PortableLunch extends Lunch{
	PortableLunch(){System.out.println("PortableLunch");}
}

class Pickle {
	Pickle(){System.out.println("pickle");}
}
public class Sandwich extends PortableLunch{
	static private Bread b=new Bread();
	private Cheese c=new Cheese();
	private Lettuce l=new Lettuce();
	private Pickle p=new Pickle();
	public Sandwich() {System.out.println("Sandwich()");}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Sandwich();
	}

}

package test8;

public class Test1 {
	static void tryRide(Cycle c) {
		c.ride();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unicycle c1=new Unicycle();
		Bicycle c2=new Bicycle();
		Tricycle c3=new Tricycle();
		tryRide(c1);
		tryRide(c2);
		tryRide(c3);
		
		Cycle cl[]= {new Unicycle(),new Bicycle(),new Tricycle()};
		for (Cycle cycle : cl) {
			//cl.balance();
		}
		((Unicycle)cl[0]).balance();
	}

}

class Cycle{
	void ride() {
		System.out.println("Cycle ride");
	}
	int wheel(Cycle c) {
		return c.wheel();
	
	}
	int wheel() {return 2;}
	
}

class Unicycle extends Cycle{
	void ride() {
		System.out.println("Unicycle ride"+wheel(this));
	}
	int wheel() {return 4;}
	void balance() {
		System.out.println("Unicycle balance"+wheel(this));
	}
}
class Bicycle extends Cycle{
	void ride() {
		System.out.println("Bicycle ride"+wheel(this));
	}
	int wheel() {return 2;}
	void balance() {
		System.out.println("Bicycle balance"+wheel(this));
	}
}
class Tricycle extends Cycle{
	void ride() {
		System.out.println("Tricycle ride"+wheel(this));
	}
	int wheel() {return 3;}
}
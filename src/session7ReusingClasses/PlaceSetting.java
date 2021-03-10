package session7ReusingClasses;
//Combining composition& inheritance
class Plate{
	Plate(int i){
		System.out.println("Plate constructor");
	}
}

class DinnerPlate extends Plate{
	DinnerPlate(int i){
		super(i);
		System.out.println("DinnerPlate constructor");
	}	
}

class Utensil{
	Utensil(int i){
		System.out.println("Utensil construction");
	}
}

class Spoon extends Utensil{
	Spoon(int i){
		super(i);
		System.out.println("spoon construction");
	}
}

class Fork extends Utensil{

	Fork(int i) {
		super(i);
		System.out.println("fork construction");
		// TODO Auto-generated constructor stub
	}
	
}

class Knife extends Utensil{

	Knife(int i) {
		super(i);
		System.out.println("fork construction");
		// TODO Auto-generated constructor stub
	}
	
}

class Custom{
	Custom(int i){
		System.out.println("Custom constructor");
	}
}
public class PlaceSetting extends Custom{
	private Spoon sp;
	private Fork frk;
	private Knife kn;
	private DinnerPlate pl;

	PlaceSetting(int i) {
		super(i+1);
		sp=new Spoon(i+2);
		frk=new Fork(i+3);
		kn=new Knife(i+4);
		pl=new DinnerPlate(i+5);
		System.out.println("PlaceSetting constructor");
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlaceSetting x=new PlaceSetting(9);
	}

}

package session10InnerClasses;
//An inner class cannot be overriden like a mehtod.

class Egg{
	private Yolk y;
	protected class Yolk{
		public Yolk() {System.out.println("Egg.Yolk()");}
	}
	
	public Egg() {
		System.out.println("New Egg()");
		y=new Yolk();
	}
}
public class BigEgg extends Egg{
	public class Yolk{
		public Yolk() {System.out.println("BigEgg.Yolk()");}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BigEgg();
	}

}

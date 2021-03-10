package session10InnerClasses;
//Nesting a class within a method.
public class Parcel5 {
	public Destination destination(String s) {
		class PDestination implements Destination{
			private String label;
			private PDestination(String whereTo) {
				label=whereTo;
			}
			@Override
			public String readLabel() {
				// TODO Auto-generated method stub
				return label;
			}		
		}
		return new PDestination(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel5 p=new Parcel5();
		Destination d=p.destination("Tasmania");
	}

}

class PDestination implements Destination{

	@Override
	public String readLabel() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
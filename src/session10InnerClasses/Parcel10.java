package session10InnerClasses;
//Using "instance initialization" to perform
//construction on an anonymous inner class.
public class Parcel10 {
	public Destination destination(final String dest,final float price) {
		return new Destination() {
			private int cost;
			//Instance initialization for each object:
			{
				cost=Math.round(price);
				if(cost>100)
					System.out.println("Over budget!");
			}

			private String label=dest;
			@Override
			public String readLabel() {
				// TODO Auto-generated method stub
				return label;
			}
		};
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel10 p=new Parcel10();
		Destination d=p.destination("Tasmania", 101.39F);
	}

}

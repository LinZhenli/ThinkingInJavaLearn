package session10InnerClasses;
//An anonymous inner class that performs
//initialization.A briefer version of Parcel5.java.
public class Parcel9 {
	//Argument must be final to use inside
	//anonymous inner class:
	public Destination destination(int dest) {

		return new Destination() {
			int j=3;
			private int label=dest;
			@Override
			public String readLabel() {
				// TODO Auto-generated method stub
				i=5;
				j=7;
				changeJ();
				return i+j+"";
			}
			public void changeJ(){
				j=10;
			}
		};
	}
	 int i = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel9 p=new Parcel9();
		Destination d=p.destination(1);

		System.out.println(d.readLabel());
//		i=0;
//		//incream(i);
//		System.out.println(i);
	}

//	static void incream(int i){
//		i++;
//	}
}

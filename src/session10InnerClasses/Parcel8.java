package session10InnerClasses;

public class Parcel8 {
	public Wrapping wrapping(int x) {
		//Base constructor call:
		return new Wrapping(x) {//Pass constructor argument
			public int value() {
				return super.value()*47;
			}
		};
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel8 p=new Parcel8();
		Wrapping w=p.wrapping(10);
	}

}

class test extends Wrapping{

	public test(int x) {
		super(x);
		// TODO Auto-generated constructor stub
	}
	public test(int x,int y) {
		super(x);
	}
	
}
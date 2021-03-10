package session7ReusingClasses;
//Inheritance&upcasting

class Instrument{
	public void play() {}
	static void tune(Instrument i) {
		i.play();
	}
}

//Wind objects are instruments
//because they have the same interface:
public class Wind extends Instrument{

	public void play() {
		System.out.println("Wind");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wind flute=new Wind();
		Instrument.tune(flute);//Upcasting
	}

}

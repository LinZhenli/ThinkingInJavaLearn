package session9Interfaces.music5;
import session8Polymorphism.music.Note;

//Interfaces.
interface Instrument {
	//Compile-time constant:
	int VALUE=5;//static & final
	//Cannot have method definitions:
	default void play(Note n){// Automatically public
		System.out.println(this+".play()"+n);
	}
	default void adjust() {
		System.out.println("Adjusting " + this);
	}
}


abstract class Wind implements Instrument{
	public String toString() {return "Wind";}
}

class Percussion implements Instrument{
	public String toString() {return "Percussion";}

	@Override
	public void play(Note n) {

	}
}

class Stringed implements Instrument{
	public void play(Note n) {System.out.println("Stringed.play()"+n);}
	public String toString() {return "Stringed";}
	public void adjust() {System.out.println(this+".adjust()");}
}

class Brass extends Wind{
	public String toString() {return "Brass";}
}


class Woodwind extends Wind{
	public String toString() {return "Brass";}
}

class Piano implements Instrument{
	public String what() {return "Piano";}
}
public class Music5 {
	//Doesn't care about type,so new types
	//added to the system still work right:
	
	public static void tune(Instrument i) {
		//...
		i.play(Note.MIDDLE_C);
	}
	
	public static void tuneAll(Instrument[] e) {
		for (Instrument instrument : e) {
			tune(instrument);
		}
	}
	
	public static void main(String[] args) {
		// Upcasting during addition to the array"
		Instrument[] orchestra= {
			new Percussion(),new Stringed(),new Brass(),new Woodwind()	
		,new Piano()};
		tuneAll(orchestra);
	}
}

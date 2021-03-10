package session9Interfaces.music4;

import session8Polymorphism.music.Note;

abstract class Instrument{
	private int i;//Storage allocated for each
	public abstract void play(Note n);
	
	public String what() {return "Instrument";}
	
	abstract void adjust() ;
}

class Wind extends Instrument{
	public void play(Note n) {System.out.println("Wind.play()"+n);}
	public String what() {return "Wind";}
	public void adjust() {}
}

class Percussion extends Instrument{
	public void play(Note n) {System.out.println("Percussion.play()"+n);}
	public String what() {return "Percussion";}
	public void adjust() {}
}

class Stringed extends Instrument{
	public void play(Note n) {System.out.println("Stringed.play()"+n);}
	public String what() {return "Stringed";}
	public void adjust() {}
}

class Brass extends Wind{
	public void play(Note n) {System.out.println("Brass.play()"+n);}
	public void adjust() {System.out.println("Brass.adjust()");}
}


class Woodwind extends Wind{
	public void play(Note n) {System.out.println("Woodwind.play()"+n);}
	public String what() {return "Woodwind";}
}

class Piano extends Instrument{
	public void play(Note n) {System.out.println("Piano.play()"+n);}
	public String what() {return "Piano";}
	public void adjust() {System.out.println("Adjusting Piano");}
}
public class Music4 {
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
			new Wind(),new Percussion(),new Stringed(),new Brass(),new Woodwind()	
		,new Piano()};
		tuneAll(orchestra);
	}
}

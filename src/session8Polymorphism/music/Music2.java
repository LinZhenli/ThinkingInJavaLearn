package session8Polymorphism.music;
//Overloading instead of upcasting

class Stringed extends Instrument{
	public void play(Note n) {
		System.out.println("Stringed.play() "+n);
	}
}

class Brass extends Instrument{
	public void play(Note n) {
		System.out.println("Brass.play() "+n);
	}
}

public class Music2{
	public static void tune(Stringed i) {
		//...
		i.play(Note.MIDDLE_C);
	}
	public static void tune(Brass i) {
		//...
		i.play(Note.MIDDLE_C);
	}
	public static void tune(Wind i) {
		//...
		i.play(Note.MIDDLE_C);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

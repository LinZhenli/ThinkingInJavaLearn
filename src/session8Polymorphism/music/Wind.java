package session8Polymorphism.music;

//Wind objects are instruments
//because they have the same interface:
public class Wind extends Instrument{

	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
		System.out.println("Wind.play() "+n);
	}

}

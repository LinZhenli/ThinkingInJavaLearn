package session8Polymorphism;
//Constructors and polymorphism
//don't produce what you might expect.

class Glyph{
	void draw() {System.out.println("Glyph.draw()");}
	Glyph(){
		System.out.println("Glyph() before draw()");
		draw();
		System.out.println("Glyph() after draw()");
	}
}

class RoundGlyph extends Glyph{
	private int radius=1;
	Glyph gl=new Glyph();
	RoundGlyph(int r){
		radius=r;
		System.out.println("RoundGlyph.RoundGlyph(),radius="+ radius);
	}
	void draw() {
		System.out.println("RoundGlyph.draw(),radius="+radius);
	}
}

class RectangularGlyph extends Glyph{
	private int radius=1;
	Glyph gl=new Glyph();
	RectangularGlyph(int r){
		radius=r;
		System.out.println("RectangularGlyph.RectangularGlyph(),radius="+ radius);
	}
	void draw() {
		System.out.println("RectangularGlyph.draw(),radius="+radius);
	}
}
public class PolyConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RoundGlyph(5);
		new RectangularGlyph(6);
	}

}

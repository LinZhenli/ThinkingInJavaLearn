package session8Polymorphism.shape;

public class Shapes {
	private static RandomShapeGenerator gen=new RandomShapeGenerator();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[]s=new Shape[9];
		//Fill up the arry with shapes:
		for(int i=0;i<s.length;i++)
			s[i]=gen.next();
		//Make polymorphic method calls:
		for(Shape shp:s) {
			shp.draw();
			shp.infor();
		}
		Shape sp=new Polygon();
		sp.infor();
	}

}

class Polygon extends Shape{

	@Override
	public void draw() {
		System.out.println("Polygon.draw()");
	}

	@Override
	public void erase() {
		System.out.println("Polygon.erase()");
	}

	@Override
	public void infor() {
		// TODO Auto-generated method stub
		System.out.println("Polygon.info()");
	}
	
}
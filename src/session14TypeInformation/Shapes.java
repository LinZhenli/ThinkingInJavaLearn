package session14TypeInformation;

import java.util.Arrays;
import java.util.List;

abstract class Shape {
	void draw() {
		System.out.println(this + ".draw()");
	}

	abstract public String toString();
}

class Circle extends Shape {
	boolean flag=false;
	public String toString() {
		return (flag ?"H":"Unh")+"ighlighted "+"Circle";
	}
}

class Square extends Shape {
	boolean flag=false;
	public String toString() {
		return (flag ?"H":"Unh")+"ighlighted "+"Square";
	}
}

class Triangle extends Shape {
	boolean flag=false;
	public String toString() {
		return (flag ?"H":"Unh")+"ighlighted "+"Triangle";
	}

}

class Rhomboid extends Shape{

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rhomboid";
	}//¿‚–Œ
	
}
public class Shapes {
	static void rotate(Shape sp) {
		if(!(sp instanceof Circle))
			System.out.println(sp+" rotate!");
	};
	public static void setFlag(Shape s) {
		if(s instanceof Triangle)
			((Triangle)s).flag = true; 
	}
	public static void main(String[] args) {
		List<Shape> shapeList=Arrays.asList(new Circle(),new Square(),new Triangle());
		for(Shape shape:shapeList)
			shape.draw();
		
		Shape sp=new Rhomboid();
		Circle cc=null;
		
		//Circle cc=(Circle)sp;//ClassCastException
		if (sp instanceof Circle)
			cc=(Circle)sp;
		cc=new Circle();
		
		setFlag(cc);
		System.out.println(cc);
		Shape tg=new Triangle();
		setFlag(tg);
		System.out.println(tg);
	
	}
}
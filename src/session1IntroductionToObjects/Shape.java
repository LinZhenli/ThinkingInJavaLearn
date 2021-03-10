package session1IntroductionToObjects;

public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape cc1=new Circle();
		
	}
	void draw() {}
	void erase() {}
	void move() {}
	void getColor() {}
	void setColor() {}
	void doSomeThing(Shape shape) {
		shape.erase();
		shape.draw();
	}
}
class Circle extends Shape{
	
}

class Square extends Shape{}

class Triangle extends Shape{}



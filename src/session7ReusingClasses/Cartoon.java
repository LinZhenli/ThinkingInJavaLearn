package session7ReusingClasses;
//Constructor calls during inheritance

class Art{
	Art(){System.out.println("Art constructor");}
}

class Drawing extends Art{
	Drawing(){
		System.out.println("Drawing constructor");
	}
}
public class Cartoon extends Drawing{
	//public Cartoon() {System.out.println("Cartoon constructor");}
	static void init() {};
	int i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cartoon x=new Cartoon();
		init();
	}

}

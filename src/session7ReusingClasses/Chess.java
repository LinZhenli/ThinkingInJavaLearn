package session7ReusingClasses;
//Inheritance,constructors and arguments.

class Game{
	Game(){
		
	}
	Game(int i){
		System.out.println("Game constructor"+i);
	}
}

class BoardGame extends Game{

	BoardGame(int i) {
		super(i);
		System.out.println("BoardGame constructor"+i);
		// TODO Auto-generated constructor stub
	}
//	BoardGame() {
//		super(10);
//		System.out.println("BoardGame constructor");
//		// TODO Auto-generated constructor stub
//	}
	
}
public class Chess extends BoardGame{

	Chess() {
		//super();
		super(11);
		System.out.println("Chess constructor");
	//	super(12);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chess x=new Chess();
	}

}

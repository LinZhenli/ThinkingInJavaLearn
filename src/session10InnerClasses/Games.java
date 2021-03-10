package session10InnerClasses;
//Using anonymous inner classes with the Game framework.

interface Game{boolean move();}
interface GameFactory{Game getGame();}

class Checkers implements Game{
	private Checkers() {}
	private int moves=0;
	private static final int MOVES=3;
	@Override
	public boolean move() {
		System.out.println("Checkers move "+moves);
		return ++moves !=MOVES;
	}
	public static GameFactory factory=new GameFactory() {

		@Override
		public Game getGame() {
			// TODO Auto-generated method stub
			return new Checkers();
		}
	};
}

class Chess implements Game{
	private Chess() {}
	private int moves=0;
	private static final int MOVES=4;
	@Override
	public boolean move() {
		System.out.println("Chess move  "+moves);
		return ++moves !=MOVES;
	}
	public static GameFactory factory=new GameFactory() {

		@Override
		public Game getGame() {
			// TODO Auto-generated method stub
			return new Chess();
		}
	};
	
}
public class Games {
	public static void playGame(GameFactory factory) {
		Game s=factory.getGame();
		while(s.move())
			;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		playGame(Checkers.factory);
		playGame(Chess.factory);
	}

}

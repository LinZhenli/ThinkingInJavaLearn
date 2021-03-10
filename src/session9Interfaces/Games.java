package session9Interfaces;
//A Game framework using Factory Methods.
interface Game{boolean move();}
interface GameFactory{Game getGame();}
class Checkers implements Game{
	private int moves=0;
	private static final int MOVES=3;
	@Override
	public boolean move() {
		// TODO Auto-generated method stub
		System.out.println("Checkers move "+moves);
		return ++moves !=MOVES;
	}
}

class CheckersFactory implements GameFactory{

	@Override
	public Game getGame() {
		// TODO Auto-generated method stub
		return new Checkers();
	}
	
}

class Chess implements Game{
	private int moves=0;
	private static final int MOVES=4;
	public boolean move() {
		System.out.println("Chess move "+moves);
		return ++moves!=MOVES;
	}
}

class ChessFactory implements GameFactory{

	@Override
	public Game getGame() {
		// TODO Auto-generated method stub
		return new Chess();
	}
	
}
public class Games {
	public static void playGame(GameFactory factory) {
		Game s=factory.getGame();
		while(s.move())
		;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		playGame(new CheckersFactory());
		playGame(new ChessFactory());
	}

}

package session4ControllingExecution;

public class WhileTest {
	static double i=0;
	static boolean condition() {
		i=Math.random();
		boolean result=i<0.99;
		System.out.println(result+""+i+",");
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(condition())
			System.out.println("inside 'whlile'");
		System.out.println("Exited 'while'");
	}

}

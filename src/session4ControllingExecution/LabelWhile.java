package session4ControllingExecution;
//While loops with "labeled break" and "labeled continue."
public class LabelWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		outer:
		while(true) {
			System.out.println("outer while loop");
			while(true) {
				i++;
				System.out.println("i= "+i);
				if(i==1) {
					System.out.println("continue");
					continue;
				}
				if(i==3) {
					System.out.println("continue outer");
					continue outer;
				}
				if(i==5) {
					System.out.println("break");
					break;
				}
				if(i==7) {
					System.out.println("break outer");
					break outer;
				}
				
			}
		}
	}

}

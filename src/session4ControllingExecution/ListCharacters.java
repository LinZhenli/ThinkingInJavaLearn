package session4ControllingExecution;
//Demonstrates "for" loop by listing
//all the lowercase ASCII letters.
public class ListCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char c=0;c<128;c++)
			if(Character.isLowerCase(c)) {
				System.out.println("value: "+(int)c+" character: "+c);
			}
	}

}

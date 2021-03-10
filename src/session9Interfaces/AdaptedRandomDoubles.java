package session9Interfaces;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

//Creating an adapter with inheritance
public class AdaptedRandomDoubles implements  RandomDoubles,Readable{
	private int count;
	public AdaptedRandomDoubles(int count){
		this.count=count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(new AdaptedRandomDoubles(7));
		while(s.hasNextDouble())
			if(s.hasNextDouble())
			System.out.println(s.nextDouble());
		
//		while(s.hasNext())
//			System.out.println(s.next());
	}

	@Override
	public int read(CharBuffer cb) throws IOException {
		// TODO Auto-generated method stub
		if(count--==0)
			return -1;
		String result=Double.toString(next())+" ";
		cb.append(result);
		return result.length();
	}

}

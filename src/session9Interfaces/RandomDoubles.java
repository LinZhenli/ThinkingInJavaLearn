package session9Interfaces;

import java.util.Random;

public interface RandomDoubles {
	 Random RAND =new Random(47);
	public default double next() {return RAND .nextDouble();}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomDoubles rd=new RandomDoubles(){};
		for(int i=0;i<7;i++)
			System.out.println(rd.next()+" ");
	}

}

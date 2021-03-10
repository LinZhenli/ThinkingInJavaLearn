package session9Interfaces;
//Initializing interface fields with

import java.util.Random;

public interface RandVals {
	Random RAND=new Random(47);
	int RANDOM_INT=RAND.nextInt(10);
	long RANDOM_LONG=RAND.nextLong()*10;
	float RANDOM_FLOAT=RAND.nextFloat()*10;
	double RANDOM_DOUBLE=RAND.nextDouble()*10;
	public static void main(String[] args) {
		System.out.println(0.2+0.4);
		System.out.println(0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1);
	}
	
}

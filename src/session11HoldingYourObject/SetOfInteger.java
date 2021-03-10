package session11HoldingYourObject;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetOfInteger {

	public static void main(String[] args) {
		Random rand=new Random();
		Set<Integer> intset=new HashSet<Integer>();
		Set<Integer> intTset=new TreeSet<Integer>();

		for(int i=0;i<10000;i++) {
			intset.add(rand.nextInt(30));
			intTset.add(rand.nextInt(30));
		}
		System.out.println(intset);
		System.out.println(intTset);

	}

}

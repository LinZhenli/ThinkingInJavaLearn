package test;

import java.util.*;

public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> linSet=new LinkedHashSet<Integer>();
		
		linSet.add(1);
		linSet.add(3);
		linSet.add(2);
		linSet.add(10);
		linSet.add(13);
		Set<Integer> treeSet=new TreeSet<Integer>(linSet);
		Set<Integer> hashSet=new HashSet<>(linSet);
		System.out.println(linSet);
		System.out.println(treeSet);
		System.out.println(hashSet);
	}

}

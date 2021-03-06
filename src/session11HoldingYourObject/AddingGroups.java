package session11HoldingYourObject;

import java.util.*;

//Adding groups of elements to Collection objects.
public class AddingGroups {

	public static void main(String[] args) {
		Collection<Integer> collection=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));//构造器可接受Collection作为参数
		Integer[] moreInts= {6,7,8,9,10};
		collection.addAll(Arrays.asList(moreInts));
		//Runs significantly faster,but you can't
		//construct a Collection this way:
		Collections.addAll(collection, 11,12,13,14,15);
		//Produces a list "backed by" an array:
		List<Integer> list=Arrays.asList(16,17,18,19,20);
		list.set(0,99);//OK --modify an element
		//list.add(21);//Runtime error because the 
		                //underlying array cannot be resized.
		System.out.println(collection);
		System.out.println(list);
	}

}

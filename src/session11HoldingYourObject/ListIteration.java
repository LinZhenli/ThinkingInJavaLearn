package session11HoldingYourObject;

import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class ListIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pet> pets=Pets.arrayList(8);

		ListIterator<Pet> it=pets.listIterator();//list独有
		while(it.hasNext()) {
			System.out.println(it.next()+","+it.nextIndex()+","+it.previousIndex()+"; ");
		}
		System.out.println();
		//Backwards:
		while(it.hasPrevious())
			System.out.println(it.previous()+" "+it.nextIndex());
		System.out.println();
		
		System.out.println(pets);
		
		it=pets.listIterator(3);//指定第n个
		while(it.hasNext()) {
			it.next();
			it.set(new Mouse());
		}
		System.out.println(pets);
	}

}

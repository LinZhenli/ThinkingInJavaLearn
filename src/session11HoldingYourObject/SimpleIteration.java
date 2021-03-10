package session11HoldingYourObject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SimpleIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<Pet> pets=Pets.arrayList(12);
		List<Pet> pets=new ArrayList<Pet>();
		pets.add(new Hamster());
		pets.add(new Mouse());
		pets.add(new Pet());
		pets.add(new Cymric());
		pets.add(new Cymric());

		pets.add(new Cymric());

		pets.add(new Cymric());

		pets.add(new Cymric());

		pets.add(new Cymric());


		Iterator<Pet> it=pets.iterator();

		while(it.hasNext()) {
			Pet p=it.next();
			System.out.println(p.id()+":"+p+" ");
		}
		System.out.println();
		//A simple approach,when possible:
		for(Pet p:pets)
			System.out.println(p.id()+":"+p+" ");
		System.out.println();
		//An Interator can also remove elements:
		it=pets.iterator();
		for(int i=0;i<6;i++)
		{
			it.next();
			it.remove();	
		}
		System.out.println(pets);
	}

}

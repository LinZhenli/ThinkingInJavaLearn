package session11HoldingYourObject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class CrossContainerIteration {
	public static void display(Iterator<Pet> it) {
		while(it.hasNext())
		{
			Pet p=it.next();
			System.out.println(p.id()+":"+p+" ");
		}
		System.out.println();
	}
	public static void display(Collection<Pet> c) {
		for (Pet pet : c) {
			System.out.println("display2:"+pet.id()+":"+pet+" ");	
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Pet> pets=Pets.arrayList(4);
		LinkedList<Pet> petsll=new LinkedList<Pet>(pets);
		HashSet<Pet> petsHS=new HashSet<Pet>(pets);
		TreeSet<Pet> petsTS=new TreeSet<Pet>(pets);
		
		display(pets.iterator());
		display(petsll.iterator());
		display(petsHS.iterator());
		display(petsTS.iterator());
//		for (Pet pet : petsTS) {
//			System.out.println(pet);
//		}
		
		display(pets);
		display(petsll);
		display(petsHS);
		display(petsTS);
		
	}

}

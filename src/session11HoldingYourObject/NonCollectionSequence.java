package session11HoldingYourObject;
import session14TypeInformation.pets.Pets;

import java.util.Iterator;

import session14TypeInformation.pets.Pet;

class PetSequence{
	protected Pet[] pets=Pets.arrayList(8).toArray(new Pet[0]);
	
}
public class NonCollectionSequence extends PetSequence{
	public Iterator<Pet> iterator() {
		return new Iterator<Pet>() {
			private int index=0;
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return index<pets.length;
			}

			@Override
			public Pet next() {
				// TODO Auto-generated method stub
				return pets[index++];
			}
			
			
		};
		
	}
	public static void main(String[] args) {
		NonCollectionSequence nc=new NonCollectionSequence();	
		InterfaceVsIterator.display(nc.iterator());
	}

}

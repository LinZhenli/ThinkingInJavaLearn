package session11HoldingYourObject;

import java.util.AbstractCollection;
import java.util.Iterator;

import session14TypeInformation.pets.Pet;
import session14TypeInformation.pets.Pets;


public class CollectionSequence extends AbstractCollection<Pet>{
	private Pet[] pets=Pets.arrayList(8).toArray(new Pet[0]);
	
	public static void main(String[] args) {
		CollectionSequence c=new CollectionSequence();
		InterfaceVsIterator.display(c);
		InterfaceVsIterator.display(c.iterator());
		//System.out.println(c instanceof Collection);
		
		

	}

	@Override
	public Iterator<Pet> iterator() {
		// TODO Auto-generated method stub
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
			public void remove() {//Not implemented
				throw new UnsupportedOperationException();
			}
			
		};
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return pets.length;
	}

}

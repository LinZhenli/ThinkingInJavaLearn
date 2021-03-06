package session14TypeInformation;

import session14TypeInformation.pets.Pet;
import session14TypeInformation.pets.Pets;
import util.TypeCounter;

public class PetCount4 {

	public static void main(String[] args) {
		TypeCounter counter=new TypeCounter(Pet.class);
		for(Pet pet:Pets.createArray(20)) {
			System.out.print(pet.getClass().getSimpleName()+" ");
			counter.count(pet);
		}
		System.out.println();
		System.out.println(counter);
	}

}

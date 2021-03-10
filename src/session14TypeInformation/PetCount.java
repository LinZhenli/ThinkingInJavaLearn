package session14TypeInformation;

import java.util.HashMap;

import session14TypeInformation.pets.Cat;
import session14TypeInformation.pets.Dog;
import session14TypeInformation.pets.ForNameCreator;
import session14TypeInformation.pets.Gerbil;
import session14TypeInformation.pets.Hamster;
import session14TypeInformation.pets.Manx;
import session14TypeInformation.pets.Mouse;
import session14TypeInformation.pets.Mutt;
import session14TypeInformation.pets.Pet;
import session14TypeInformation.pets.PetCreator;
import session14TypeInformation.pets.Pug;
import session14TypeInformation.pets.Rat;
import session14TypeInformation.pets.Rodent;

//Using instance of
public class PetCount {
	static class PetCounter extends HashMap<String,Integer>{
		public void count(String type) {
			Integer quantity=get(type);
			if(quantity==null)
				put(type,1);
			else
				put(type,quantity+1);	
		}
	}
	public static void countPets(PetCreator creator) {
		PetCounter counter=new PetCounter();
		for(Pet pet:creator.createArray(20)) {
			//List each individual pet:
			System.out.print(pet.getClass().getSimpleName()+" ");
			if(pet instanceof Pet)
				counter.count("Pet");
			if(pet instanceof Dog)
				counter.count("Dog");
			if(pet instanceof Mutt)
				counter.count("Mutt");
			if(pet instanceof Pug)
				counter.count("Pug");
			if(pet instanceof Dog)
				counter.count("Dog");
			if(pet instanceof Cat)
				counter.count("Cat");
			if(pet instanceof Manx)
				counter.count("EgyptianMau");
			if(pet instanceof Manx)
				counter.count("Manx");
			if(pet instanceof Manx)
				counter.count("Cymric");
			if(pet instanceof Rodent)
				counter.count("Rodent");
			if(pet instanceof Rat)
				counter.count("Rat");
			if(pet instanceof Mouse)
				counter.count("Mouse");
			if(pet instanceof Hamster)
				counter.count("Hamster");		
			if(pet instanceof Gerbil)
				counter.count("Gerbil");	
		}
		//Show this counts:
		System.out.println();
		System.out.println(counter);
	}
	public static void main(String[] args) {
		countPets(new ForNameCreator());
	}
}

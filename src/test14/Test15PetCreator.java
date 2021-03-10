package test14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import session14TypeInformation.pets.Cat;
import session14TypeInformation.pets.EgyptianMau;
import session14TypeInformation.pets.Pet;


//Creates random sequences of Pets.
public class Test15PetCreator {
	private Random rand=new Random(47);
	//The List of the different types of Pet to create:
	public static List<Factory<?extends Pet>> types=new ArrayList<Factory<?extends Pet>>();
	static {
		types.add(new Cat.Factory());
		types.add(new Pet.Factory());
		types.add(new EgyptianMau.Factory());
		
	}
	public Pet randomPet() {//Create one random Pet
		int n=rand.nextInt(types.size());
		return types.get(n).create();
		
	}
	public Pet[] createArray(int size) {
		Pet[] result=new Pet[size];
		for(int i=0;i<size;i++)
			result[i]=randomPet();
		return result;
	}
	
	public ArrayList<Pet> arrayList(int size){
		ArrayList<Pet> result=new ArrayList<Pet>();
		Collections.addAll(result, createArray(size));
		return result;
	}
}

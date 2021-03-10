package test14;
//Facade to produce a default PetCreator
import java.util.ArrayList;

import session14TypeInformation.pets.Pet;
import util.TypeCounter;


public class Test15Pets{
		public static final Test15PetCreator creator=new Test15PetCreator();
		public static Pet randomPet() {
			return creator.randomPet();
		}
		public static Pet[] createArray(int size) {
			return creator.createArray(size);
		}
		
		public static ArrayList<Pet> arrayList(int size){
			return creator.arrayList(size);
		}
//	public static ArrayList<Pet> arrayList(int x){
//		Random rand=new Random();
//		ArrayList<Pet> list=new ArrayList<Pet>();
//		Random ra=new Random();
//		
//		Pet[] p= {new Hamster(),new Mouse(),new Cymric(),new Pug()};
//		while(x-->0) {
//			
//			list.add(p[ra.nextInt(4)]);
//		}
//		
//		return list;
//	}
		public static void main(String[] args) {
			TypeCounter tc=new TypeCounter(Pet.class);
			for (Pet pet : arrayList(10)) {
				tc.count(pet);
				System.out.println(pet.getClass().getSimpleName());
			}
			System.out.println(tc);
		}
}

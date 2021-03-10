package session14TypeInformation.pets;
//Facade to produce a default PetCreator
import java.util.ArrayList;


public class Pets{
		public static final PetCreator creator=new LiteralPetCreator();
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
}

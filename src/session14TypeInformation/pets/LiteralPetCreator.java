package session14TypeInformation.pets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Using class literals.
public class LiteralPetCreator extends PetCreator{
	//No try block needed.
	public static final List<Class<? extends Pet>> allTypes= 
			Collections.unmodifiableList(Arrays.asList(Pet.class,Dog.class,Cat.class,Rodent.class,
					Mutt.class,Pug.class,EgyptianMau.class,Manx.class,Cymric.class,Rat.class,Mouse.class,Hamster.class,Gerbil.class));
	//Types for random creation:
	private static final List<Class<? extends Pet>> types=allTypes.subList(allTypes.indexOf(Mutt.class), allTypes.size());
	@Override
	public List<Class<? extends Pet>> types() {
		// TODO Auto-generated method stub
		return types;
	}

}

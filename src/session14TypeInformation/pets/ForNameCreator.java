package session14TypeInformation.pets;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator{
	private static List<Class<? extends Pet>> types=new ArrayList<Class<? extends Pet>>();
	//Types that you want to be randomly created;
	private static String[] typeNames= {
			"session14TypeInformation.pets.Mutt",
			"session14TypeInformation.pets.Pet",
			"session14TypeInformation.pets.EgyptianMau",
			"session14TypeInformation.pets.Manx",
			"session14TypeInformation.pets.Cymric",
			"session14TypeInformation.pets.Rat",
			"session14TypeInformation.pets.Mouse",
			"session14TypeInformation.pets.Hamster",

			"session14TypeInformation.pets.Gerbil"


			
	};
	@SuppressWarnings("unchecked")
	private static void loader() {
		try {
			for (String name : typeNames) {
				types.add((Class<? extends Pet>)Class.forName(name));
			}
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	static {loader();}
	@Override
	public List<Class<? extends Pet>> types() {
		// TODO Auto-generated method stub
		return types;
	}

}

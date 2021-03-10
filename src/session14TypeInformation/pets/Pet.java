package session14TypeInformation.pets;

public class Pet extends Individual{
	public Pet(String name) {super(name);}
	public Pet() {super();}
	public static class Factory implements test14.Factory<Pet>{

		@Override
		public Pet create() {
			// TODO Auto-generated method stub
			return new Pet();
		}
		
	}
}

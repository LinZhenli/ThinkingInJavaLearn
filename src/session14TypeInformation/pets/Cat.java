package session14TypeInformation.pets;

public class Cat extends Pet{
	public Cat(String name) {super(name);}
	public Cat() {super();}
	public static class Factory implements  test14.Factory<Cat>{

		@Override
		public Cat create() {
			// TODO Auto-generated method stub
			return new Cat();
		}
		
	} 
}

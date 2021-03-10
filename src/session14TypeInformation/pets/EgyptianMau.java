package session14TypeInformation.pets;

public class EgyptianMau extends Cat{
	public EgyptianMau(String name) {super(name);}
	public EgyptianMau() {super();}
	public static class Factory implements  test14.Factory<EgyptianMau>{

		@Override
		public EgyptianMau create() {
			// TODO Auto-generated method stub
			return new EgyptianMau();
		}
		
	} 
}

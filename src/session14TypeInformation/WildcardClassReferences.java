package session14TypeInformation;

public class WildcardClassReferences {
	public static void main(String[] args) {	
		Class<?> intClass=int.class;
		intClass=double.class;
		//Class<Number>genericNumberClass=int.class; //Illegal
	}
}

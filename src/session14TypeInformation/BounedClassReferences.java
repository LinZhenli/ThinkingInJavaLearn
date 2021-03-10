package session14TypeInformation;

public class BounedClassReferences {

	public static void main(String[] args) {
		Class<? extends Number> bounded=int.class;
		bounded=double.class;
		bounded=Number.class;
		//Or anything else derived from Number.
	}

}

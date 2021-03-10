package session14TypeInformation;

import java.util.Random;

class Initable{
	static final int staticFinal=47;
	static final int staticFinal2=ClassInitialization.rand.nextInt(1000);
	static {
		System.out.println("Initializing Initable");
	}
}

class Initable2{
	static int staticNonFinal=147;
	static {
		System.out.println("Initializing Initable2");
	}
}

class Initable3{
	static int staticNonFinal=74;
	static {
		System.out.println("Initializing Initable3");
	}
}

class Initable4{
	static final int staticFinal=23;
	static {
		System.out.println("Initializing Initable4");
	}
}
class Initable5{
	static final int staticFinal=Initable4.staticFinal;
	static {
		System.out.println("Initializing Initable5");
	}
}
public class ClassInitialization {
	public static Random rand=new Random(47);
	public static void main(String[] args) throws Exception{
		Class initable=Initable.class;
		System.out.println("After creating Initable ref");
		//Does not trigger initialization:
		System.out.println(Initable.staticFinal);
		//Does trigger initialization:
		System.out.println(Initable.staticFinal2);
		//Does trigger initialization:
		System.out.println(Initable2.staticNonFinal);
		Class initable3=Class.forName("session14TypeInformation.Initable3");
		System.out.println("After creating Initable3 ref");
		System.out.println(Initable3.staticNonFinal);
		System.out.println(Initable5.staticFinal);
		System.out.println("After creating Initable5 ref");
	}

}

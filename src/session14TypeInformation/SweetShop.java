package session14TypeInformation;
//Examination of the way the class loader works.
class Candy{
	static {System.out.println("Loading Candy");}
	
}

class Gum{
	static {System.out.println("Loading Gum");}
}

class Cookie{
	static {System.out.println("Loading Cookie");}
}
public class SweetShop {
	public static void main(String[] args) throws Exception {
		System.out.println("inside main");
		new Candy();
		System.out.println("Afer creating Candy");
		try {
			Class.forName("session14TypeInformation.Gum");
		} catch (ClassNotFoundException e) {
			throw new Exception(e+" Couldn't find Gum");
		}
		System.out.println("After Class.forName(\"Gum\")");
		new Cookie();
		System.out.println("After creating Cookie");
		//Test7
		if(args.length<1){
			System.out.println("Usage:sweetName");
			System.exit(0);
		}
		Class c=null;
		try {
			c=Class.forName("session14TypeInfomation."+args[0]);
			System.out.println("Enjoy your "+args[0]);
		} catch (ClassNotFoundException e) {
			System.out.println("Couldn't find " + args[0]);
		}
		
	}
}

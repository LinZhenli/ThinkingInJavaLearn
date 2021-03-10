package session5InitializationAndCleanup;
class Person{//eat
	
	public void eat(Apple apple) {
		Apple peeled=apple.getPeeled();
		System.out.println("Yummy");
	}
}

class Peeler{
	static Apple peel(Apple apple) {
//		//...remove peel
		return apple;//Peeled
	}
}
class Apple{
	Apple getPeeled() {return Peeler.peel(this);}
}
public class PassingThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Person().eat(new Apple());
	}

}

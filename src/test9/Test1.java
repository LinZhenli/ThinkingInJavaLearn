package test9;


class Info{
	static int i=0;
	static long refcount=0;
	Info(){
		System.out.println("info"+(++i));
	}
	long RefAdd(){
		return ++refcount;
	}
	public long dispose() {
		if(--refcount==0)
			System.out.println("Info dispose!");
		return refcount;
	}
	
}
abstract class Rodent{
	Info inf=new Info();
	Rodent(){
		inf.RefAdd();
		System.out.println("Rodent constuctor");
	}
	public abstract void kind() ;
	public  void dispose() {
		System.out.println(inf.dispose()+"refcount");
	}
	public void play() {
		System.out.println("Rodent is playing!");
	}
	public void eat() {
		System.out.println("Rodent is eating!");
	}
}

class Mouse extends Rodent{
	Info inf=new Info();
	Mouse(){
		System.out.println("Mouse constuctor");
	}
	@Override
	public void kind() {
		System.out.println("Mouse");
	}

	@Override
	public void play() {
		System.out.println("Mouse is playing!");
	}

	@Override
	public void eat() {
		System.out.println("Mouse is eating!");
	}
}

class Gerbil extends Rodent{
	@Override
	public void kind() {
		System.out.println("Gerbil");
	}

	@Override
	public void play() {
		System.out.println("Gerbil is playing!");
	}

	@Override
	public void eat() {
		System.out.println("Gerbil is eating!");
	}
}

class Hamster extends Rodent{
	@Override
	public void kind() {
		System.out.println("Hamster");
	}

	@Override
	public void play() {
		System.out.println("Hamster is playing!");
	}

	@Override
	public void eat() {
		System.out.println("Hamster is eating!");
	}
}

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rodent[] rd=new Rodent[]{new Mouse(),new Gerbil(),new Hamster()};
		for (Rodent rodent : rd) {
			rodent.kind();
			rodent.play();
			rodent.eat();
			rodent.dispose();
		}
		
		
	}

}


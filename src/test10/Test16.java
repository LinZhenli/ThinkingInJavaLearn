package test10;



class Unicycle implements Cycle{
	private Unicycle() {}
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Unicycle.method1()");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
	public static CycleFactory factory(){
		return new CycleFactory() {

			@Override
			public Cycle getCycle() {
				// TODO Auto-generated method stub
				return new Unicycle();
			}
			
		};
	}
	
}

public class Test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("hello");
			Unicycle.factory().getCycle().method1();
	}

}

interface Cycle{
	void method1();
	void method2();
}

interface CycleFactory{
	Cycle getCycle();}

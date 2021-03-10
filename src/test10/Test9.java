package test10;
interface Intf{
	void method();
}
public class Test9 {

	Intf getI() {
		
		class Intfk implements Intf{

			@Override
			public void method() {
				// TODO Auto-generated method stub
				
			}
			
		}
		return new Intfk() ;
		
	}
	void method() {
		//!new Test9().new Intfk();
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

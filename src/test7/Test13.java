package test7;

class Hello {
	void method(int i){
		System.out.println("int");
	}
void method(char i){
		
	}
void method(byte i){
	
}
}
public class Test13 extends Hello{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test13 t=new Test13();
		t.method(1);
		t.method(1.1f);
	}
	void method(float i) {
		System.out.println("float");
	}
}

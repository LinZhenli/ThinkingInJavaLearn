package test9;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PrintInt();
	}

}


abstract class PrintM{
	PrintM(){
		print();
	}
	abstract void print();
}

class  PrintInt extends PrintM{
	int i=1;
	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println(i);
	}
	
}
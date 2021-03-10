package test10;

public class Test15 {
	OtherC getC() {
		return new OtherC(2){
			
		};
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test15().getC();
	}

}

class OtherC{
	OtherC(int i){
		System.out.println(i);
	}
}
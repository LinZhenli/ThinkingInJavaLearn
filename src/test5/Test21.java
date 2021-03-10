package test5;

public class Test21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (PaperFaceValue pf : PaperFaceValue.values()) {
			System.out.println(pf+""+pf.ordinal());
		};
		
	}
	 static void describe(PaperFaceValue pf) {
		switch (pf) {
		case ONE: System.out.println("you");
			
			break;

		default:
			break;
		}
	}

}
enum PaperFaceValue{
	ONE,TWO,THREE,FIVE,TEN
}

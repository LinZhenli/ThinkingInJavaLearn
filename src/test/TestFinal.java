package test;

public class TestFinal {
	static int i=1;
	static StringBuffer s=new StringBuffer();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(incream(i));
		System.out.println(incream(i));
		hin(s);
		hin(s);
		System.out.println(s);
		//System.out.println(hin(s));
	}
	static int incream(int j){
		return ++j;
	}
	
	static StringBuffer hin(StringBuffer s) {
		s.append("h");
		return s;
	}
}

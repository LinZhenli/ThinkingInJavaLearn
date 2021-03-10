package session3Operators;
//直接常量
public class Literals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i1=-0x2f;//十六进制
		int i1=0xffffffff;
		System.out.println(Integer.toBinaryString(i1));
		System.out.println(i1);
		int i2=0b111;//二进制
		System.out.println(i2);
		int i3=0177;//八进制
		System.out.println(Character.SIZE);
		System.out.println(Integer.SIZE);
		short s1=12;
		System.out.println(Integer.toBinaryString(s1));

		long l1=13;
		System.out.println(Long.toBinaryString(l1));

		
	}

}

package session3Operators;

public class URShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=-1;
		System.out.println(Integer.toBinaryString(i));
		i>>>=10;
		System.out.println(Integer.toBinaryString(i));
		System.out.println(i);
		
		int i1=Integer.MIN_VALUE;
		System.out.println(Integer.toBinaryString(i1));
		short s=-1;
		System.out.println(Integer.toBinaryString(s));
		s>>>=10;
		System.out.println(Integer.toBinaryString(s));//32λ����10λ��һ�� 22λ��shortֻ��16λ�����ض��ˡ�
		System.out.println(Integer.toBinaryString(s>>>10));
		System.out.println(s>>>10);




	}

}

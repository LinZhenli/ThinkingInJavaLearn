package test;

public class TestChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strStringType="my string"; //����һ���ַ�������strStringType
		char[] chrCharArray; //����һ���ַ�����chrCharArray
		chrCharArray = strStringType.toCharArray(); //���ַ�������ת��Ϊ�ַ�����
		strStringType= String.valueOf(chrCharArray ); //���ַ�����ת��Ϊ�ַ���
		String newString=new String(chrCharArray);
		System.out.println("newString:"+newString);
		System.out.println(strStringType);

	}

}

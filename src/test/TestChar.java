package test;

public class TestChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strStringType="my string"; //创建一个字符串变量strStringType
		char[] chrCharArray; //创建一个字符数组chrCharArray
		chrCharArray = strStringType.toCharArray(); //将字符串变量转换为字符数组
		strStringType= String.valueOf(chrCharArray ); //将字符数组转换为字符串
		String newString=new String(chrCharArray);
		System.out.println("newString:"+newString);
		System.out.println(strStringType);

	}

}

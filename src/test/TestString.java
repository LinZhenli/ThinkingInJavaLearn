package test;

import org.junit.Test;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String se="Äã";
		Character c='Äã';
		System.out.println(c);
		System.out.println(se.getBytes().length);
		String s=null;
		if(s!=null&&!s.equals(""))
			System.out.println(s);
		else
			System.out.println("ÇëÖØÐÂÊäÈë");
		System.out.println(StringChange("hellow"));
		System.out.println(StringChange2("hellow"));
		String s1="ABC";
		String s2=s1.toUpperCase();
		System.out.println(s1==s2);

		System.out.println("------------");

	}

	@Test
	public void stringIndexof(){
		String s="abc1deabcab";
		System.out.println(s.indexOf('1'));

	}

	@Test
	public void stringJoin(){
		String s=String.join("","abc","bbc","jbc");
		System.out.println(s);

	}

	public static String StringChange(String s) {
		//StringBuffer sb=new StringBuffer();
		char c[]=s.toCharArray();
		char buf;
		for(int i=0;i<c.length-1;i++)
		{
			buf=c[i];
			c[i]=c[i+1];
			c[i+1]=buf;
			++i;
		}
		
		return new String(c);		
	}
	
	public static String StringChange2(String s) {
		StringBuffer sb=new StringBuffer(s);
		char buf;
		for(int i=0;i<sb.length();i++)
		{
			buf=sb.charAt(i);
			sb.setCharAt(i, sb.charAt(i+1));
			sb.setCharAt(i+1, buf);
			++i;
		}
		
		return new String(sb);		
	}
}


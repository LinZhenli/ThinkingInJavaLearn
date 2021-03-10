package test;

import java.io.UnsupportedEncodingException;

public class TestByte {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		String a="аж";
		String aiso=new String(a.getBytes(),"ISO-8859-1");
		System.out.println(new String(aiso.getBytes("ISO-8859-1")));
		byte b='b';
		Byte b2=new Byte("1");
		System.out.println(b);
		byte bb=(byte)0;
		System.out.printf("%02X",bb);
	}

}

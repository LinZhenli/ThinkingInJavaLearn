package test;

import java.util.ArrayList;

public class TestCount {
	private static long count=0;
	private long num=count++;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestCount();
		new TestCount();
		System.out.println(count);
	}

}

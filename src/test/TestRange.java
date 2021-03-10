package test;

import java.util.Arrays;

public class TestRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(range(10)));
	}
	public static int[] range(int end) {
		int a[]=new int[end];
		for(int i=0;i<end ;i++)
		{
			a[i]=i;
		}
		return a;
	}
}

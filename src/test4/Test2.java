package test4;

import java.util.Random;

public class Test2 {
	static int result=0;
	static void test(int testval,int target) {
		if(testval>target)
			result=+1;
		else if(testval<target)
			result=-1;
		else
			result=0;//Match
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int a=0,b=0;
		for(int i=0;i<25;i++)
		{
			a=b;
			b=r.nextInt();
			test(a,b);
			System.out.println("µÚ"+(i+1)+"´Î£º"+a+","+b+","+result);
		}
	}
}

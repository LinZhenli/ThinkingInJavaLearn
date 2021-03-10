package util;

public class Range {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		for (int i : range(10)) {

			System.out.println(i);

		};

		

		for (int i : range(10,12)) {

			System.out.println(i);

		};

		

		for (int i : range(8,12,3)) {

			System.out.println(i);

		};

		

		

	}

	

	public static int[] range(int i) {

		int[] b = new int[i];

		for(int j=0;j<i;j++) {

			b[j]=j;

		}

		return b;

	}

	

	public static int[] range(int begin,int end) {

		int[] b = new int[end-begin];

		for(int j=0;j<end-begin;j++) {

			b[j]=begin+j;

		}

		return b;

	}

	

	public static int[] range(int begin,int end,int step) {

		int[] b = new int[(end-begin)/step];

		for(int j=0;j<(end-begin)/step;j++) {

			b[j]=begin+step*j;

		}

		return b;

	}

	

}

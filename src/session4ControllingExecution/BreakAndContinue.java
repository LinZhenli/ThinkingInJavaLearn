package session4ControllingExecution;

import util.Range;

//Demonstrates break and continue keywords.
public class BreakAndContinue {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++) {
			if(i==74)break;//Out for loop
			if(i%9!=0) continue;//next iteration
			System.out.println(i+" ");
		}
		System.out.println();
		//Using foreach:
		for (int i : Range.range(100)) {
			if(i==74) break;
			if(i%9!=0) continue;
			System.out.println(i+" ");
		}
		System.out.println();
		int i=0;
		//An "infinite loop"
		while(true) {
			i++;
			int j=i*27;
			if(j==1269) break;
			if(i%10!=0) continue;
			System.out.println(i+" ");
		}
	}
}

package session4ControllingExecution;

import java.util.Arrays;

public class VampireNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[4];
		int b[]=new int[4];
		for(int i=10;i<=99;i++)
		{
			for(int j=i;j<=99;j++)
			{
				a[0]=i/10;
				a[1]=i%10;
				a[2]=j/10;
				a[3]=j%10;
				int sub=i*j;
				b[0]=sub/1000;
				b[1]=sub%1000/100;
				b[2]=sub%1000%100/10;
				b[3]=sub%1000%100%10;
				int count=0;
				for(int x=0;x<4;x++) {
					for(int y=0;y<4;y++) {
						if(a[x]==b[y]) {
							a[x]=-1;
							b[y]=-2;
							count++;
						}
					}
				}
				if(count==4)
					System.out.println(sub+"="+i+"*"+j);
			}
		}
	}

}

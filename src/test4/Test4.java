package test4;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long timeBegin=System.nanoTime();
		loop:for(int i=3;i<=1000;i++)
		{
			for(int j=2;j<=i/2+1;j++) {
				if(i%j==0)
				{
					continue loop;
				}
				//if(j>=i/2+1)
					

			}
			System.out.println(i);
		}
		
		Long timeEnd=System.nanoTime();
		System.out.println(timeEnd-timeBegin);

	}

}

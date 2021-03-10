package test2;

public class Test1 {
	int a;
	char b;
	static int c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 ts=new Test1();
		Test1 ts2=new Test1();
		ts.a=1;
		ts2.a=1;
		ts.c=1;
		ts2.c=2;
		System.out.println("a="+ts.a);
		System.out.println("b="+ts.b);
		System.out.println("ts.c==ts2.c:"+(ts.c==ts2.c));
		System.out.println("ts.a==ts2.a:"+(ts.a==ts2.a));
		int i=2;
		Integer d=i;
	}

}

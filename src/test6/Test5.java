package test6;

public class Test5 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ts t5=new ts();
		System.out.println(t5.pb+t5.pt+t5.fd);//t5.pr private member can not be access.
	}
}

class ts{
	public int pb;
	protected int pt;
	int fd;
	private int pr;
}

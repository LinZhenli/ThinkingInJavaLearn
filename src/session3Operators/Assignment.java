package session3Operators;
//Assignment with objects  is a bit tricky.
class Tank{
	int level;
}
public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank t1=new Tank();
		Tank t2=new Tank();
		t1.level=9;
		t2.level=47;
		System.out.println("1:t1.level: "+t1.level+",t2.level:"+t2.level);
		t1=t2;//已指向同一对象。
		System.out.println("2:t1.level: "+t1.level+",t2.level:"+t2.level);
		t1.level=27;
		System.out.println("3:t1.level: "+t1.level+",t2.level:"+t2.level);

	}

}

package test10;


import session10InnerClasses.Selector;
import session10InnerClasses.Sequence;

public class Test2 {
	String s="abc";
	@Override
	public String toString() {
		
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sequence sq=new Sequence(3);
		sq.add(new Test2());
		sq.add(new Test2());
		sq.add(new Test2());
		Selector selector=sq.selector();
		while(!selector.end()){
			System.out.println(selector.current());
			selector.next();
		}
	}
	

}

package test;

import java.util.HashSet;
import java.util.Set;
public class TestApple {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set=new HashSet();
	}
	

}

class Peeler{
	static Apple peel(Apple apple) {
		return apple;
	}
}
class Apple{
	Apple getPeeled() {
		return Peeler.peel(this);
	}
}

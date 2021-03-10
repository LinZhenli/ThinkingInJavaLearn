package test14;

public class Test8 {
	static void printExtends(Object obj) {
		Class buff=obj.getClass();
		System.out.println(buff);
		buff=buff.getSuperclass();
		if(buff instanceof Object)
			try {
				printExtends(buff.newInstance());
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printExtends(new Test8());
	}

}

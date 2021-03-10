package test9;

import session9Interfaces.interfaceprocessor.Processor;

public class Test11 {
	String method1(String s) {return new StringBuilder(s).reverse().toString();}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Test11Adapter implements Processor{
	Test11 ts;

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName();
	}

	@Override
	public Object process(Object input) {
		// TODO Auto-generated method stub
		return ts.method1((String)input);
	}
	
}

package test14;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import test14.inside25.Test25;

public class Test25Call {

	public static void main(String[] args) throws Exception {
		Test25 ts=new Test25();
		//ts.
		Class ts25=Test25.class;
		Method method=ts25.getDeclaredMethod("method1", null);
		method.setAccessible(true);
		method.invoke(ts, null);
		
		method=ts25.getDeclaredMethod("method2", null);
		method.setAccessible(true);
		method.invoke(ts, null);
		

	}

}

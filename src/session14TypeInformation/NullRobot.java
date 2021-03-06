package session14TypeInformation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collections;
import java.util.List;

import util.Null;

//Using a dynamic proxy to create a Null Object.

class NullRobotProxyHandler implements InvocationHandler{
	private String nullName;
	private Robot proxied=new NRobot();
	NullRobotProxyHandler(Class<? extends Robot> type){
		nullName=type.getSimpleName()+" NullRobot";
	}
	private class NRobot implements Null,Robot{

		@Override
		public String name() {
			return nullName;
		}

		@Override
		public String model() {
			// TODO Auto-generated method stub
			return nullName;
		}

		@Override
		public List<Operation> operations() {
			// TODO Auto-generated method stub
			return Collections.emptyList();
		}
		
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		return method.invoke(proxied, args);
	}
	
}
public class NullRobot {
	public static Robot newNullRobot(Class<? extends Robot> type) {
		return (Robot) Proxy.newProxyInstance(NullRobot.class.getClassLoader(), 
				new Class[] {Null.class,Robot.class}, new NullRobotProxyHandler(type));
	}
	public static void main(String[] args) {
		Robot[] bots= {new SnowRemovalRobot("SnowBee"),newNullRobot(SnowRemovalRobot.class)};
		for(Robot bot: bots)
		{
			System.out.println();
			Robot.Test.test(bot);
		}
	}
}

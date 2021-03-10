package session12ErrorHandingWithExceptions;

import com.sun.istack.internal.logging.Logger;

//An exception that reports through a Logger.
class LoggingException extends Exception{
	private static Logger logger=Logger.getLogger("LoggingException", null);
	public LoggingException() {
		
	}
}
public class LoggingExceptions extends Exception{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

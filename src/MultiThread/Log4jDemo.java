package MultiThread;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Log4jDemo {
private static final Logger Log=LogManager.getLogger(Log4jDemo.class);
public static void main(String args[]) {
	Log.debug("This is my message");
	Log.info("this is my information");
	Log.fatal("this is my fatal message");
	Log.error("This is my error message");
	Log.debug("this is my debug mesaage");
}
}

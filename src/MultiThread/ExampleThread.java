package MultiThread;
 class Threadd extends Thread {
	@Override
	public void run() {
	System.out.println("in run method of thread"+Thread.currentThread().getName());
	
}
}	
public class  ExampleThread{
public static void main(String args[]) {
	System.out.println("in main method-"+Thread.currentThread().getName());
	new Threadd().start();
}

}
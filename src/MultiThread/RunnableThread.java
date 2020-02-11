package MultiThread;
class Threa extends Thread{
	@Override
	public void run() {
		System.out.println("in run method"+Thread.currentThread().getName());
	}
	
}

public class RunnableThread {
public static void main(String args[]) {
	System.out.println("in main method"+Thread.currentThread().getName());
	Thread t=new Thread(new Threa(),"mounish");
	System.out.println("is thread t alive:"+t.isAlive());
	Thread t1=new Thread(new Threa(),"thalha");
	t.start();
	try {
		t.sleep(5000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	
	t1.start();
	System.out.println("is thread t1 alive:"+t1.isAlive());
}
}

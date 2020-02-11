package MultiThread;

class Counter{
public void increment() {
	synchronized(this) {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+"i-"+i);
			try {
				Thread.sleep(100);
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
 public synchronized void decrement() {
	 synchronized(this) {
			for(int i=5;i>=1;i--) {

 
				
				System.out.println(Thread.currentThread().getName()+"i-"+i);
			}
				try {
					Thread.sleep(100);
					
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			
 }
 }
}

 class IncrementThread implements Runnable{
	 Counter ctr;
	 public IncrementThread(Counter ctr) {
		this.ctr=ctr; 
	 }
	public void run() {
		ctr.increment();
	}
 }
 class DecrementThread implements Runnable{
Counter ctr;
public DecrementThread(Counter ctr) {
	this.ctr=ctr;
}
@Override
public void run() {
	// TODO Auto-generated method stub
ctr.decrement();

}
}
 public class SynchronizedExample {
	 public static void main(String args[]) {
		 Counter ctr=new Counter();
	 Thread t = new Thread(new IncrementThread(ctr));
	 Thread t1 = new Thread(new DecrementThread(ctr));
	 t.start();
	 t1.start();
	 }
	 }


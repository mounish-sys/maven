package MultiThread;
import java.util.LinkedList;

public class ProducerConsumer {
	
	    public static void main(String[] args)
	    {
	    LinkedList<Integer> list=new LinkedList<Integer>();
	    Thread t1=new Thread(new Producer(list),"producer");
	    Thread t2=new Thread(new Consumer(list),"consumer");
	    t1.start();
	    t2.start();
	    }
	}
	class Consumer implements Runnable
	{
	LinkedList<Integer> list;
	Consumer(LinkedList<Integer> list)
	{
	this.list=list;
	}
	@Override
	public void run()
	{
	for(int i=1;i<=5;i++)
	{
	synchronized(list)
	{
	while(list.size()<1)
	{
	System.out.println("waiting,as queue is full");
	try
	{
	list.wait();
	}
	catch(InterruptedException e)
	{
	e.printStackTrace();
	}
	}
	}
	}
	}
	}
	class Producer implements Runnable
	{
	LinkedList<Integer> list;
	Producer(LinkedList<Integer> list)
	{
	this.list=list;
	}
	@Override
	public void run()
	{
	for(int i=1;i<=5;i++)
	{
	synchronized(list)
	{
	while(list.size()>=1)
	{
	System.out.println("waiting,as queue is full");
	try
	{
	list.wait();
	}
	catch(InterruptedException e)
	{
	e.printStackTrace();
	}
	}
	}
	}
	}
	}


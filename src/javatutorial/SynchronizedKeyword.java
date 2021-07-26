package javatutorial;
class Counter{
	int count;
	public synchronized void counter() {//Synchronized the method when one 
		count++;                       //thread is accesing no other thread can access
	}
}

public class SynchronizedKeyword {
public static void main(String args[]) throws Exception {
	Counter c = new Counter();
	Thread t1 = new Thread(new Runnable()
			{
		public void run() {
			for(int i=0;i<500;i++) {
				c.counter();
			}
		}
		
			});
	Thread t2 = new Thread(new Runnable()
	{
public void run() {
	for(int i=0;i<500;i++) {
		c.counter();
	}
}

	});
	t1.start();
	t2.start();
	t1.join();
	t2.join();
	System.out.println("count "+ c.count);
}
}

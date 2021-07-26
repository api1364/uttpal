package javatutorial;

public class MultiThreadUsingInterface {
	public static void main(String args[]) throws Exception {
Thread t1 = new Thread(()->{
	for(int i=0;i<5;i++) {
	//start method search for run and call it to execute
	System.out.println("hi");
	try {Thread.sleep(100);} catch(Exception e) {}
	}
});
//we can not call start method from runnable so we created object of runnable 
Thread t2 = new Thread(()->
{//lemda expression
	for(int i=0;i<5;i++) {
		System.out.println("hello");
		try {Thread.sleep(200);} catch(Exception e) {}
	}
});
t1.setName("uttpal thread");//setting the name of the thread
t2.setName("ujjwal thread");
System.out.println(t1.getName());
System.out.println(t2.getName());//printing the name of the thread
//and calling it with the help of object of thread class and start method
t1.start();//thread class have start method defined
try {Thread.sleep(100);} catch(Exception e) {}
t2.start();
t1.join();//t1 will wait to join
t2.join();//t2 will wait to join
System.out.println(t1.isAlive());//to check whether t1 is running or not;
System.out.println("Bye");

}
	}


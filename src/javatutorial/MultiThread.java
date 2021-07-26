package javatutorial;
class Hi extends Thread{
	public void run() {//always declare run method it is default method of thread class
		for(int i=0;i<5;i++) {//start method search for run and call it to execute
			System.out.println("hi");
			try {Thread.sleep(1000);} catch(Exception e) {}
		}
	}
}
class Hello extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("hello");
			try {Thread.sleep(2000);} catch(Exception e) {}
		}
	}
}
public class MultiThread {
	public static void main(String args[]) {
Thread obj1 = new Hi();
Thread obj2 = new Hello();
obj1.start();//thread class have start method defined
try {Thread.sleep(1000);} catch(Exception e) {}
obj2.start();
}
	}


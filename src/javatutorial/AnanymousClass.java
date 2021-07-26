package javatutorial;
//types of interface
//1 Normal: having more than 1 method;
//2 Functional interface have only 1 method
//3 marker interface have no method
interface Int{
	void show();
}
public class AnanymousClass {
public static void main(String args[]) {
	Int obj = new Int() 
	{
		public void show() {
			System.out.println("in ananymous class");//ananymous class
			
		}
	};
	obj.show();
}
}
//in ananymous class object is created first
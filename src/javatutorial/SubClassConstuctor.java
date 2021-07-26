package javatutorial;

class Parent{
	public Parent() {
		System.out.println("Constructor of class A is called");
	}
}
class B extends Parent{
	public B() {
		System.out.println("Constructor of class B is called");
	}
}
public class SubClassConstuctor {
public static void main(String args[])
{
	B obj = new B();//when we are creating the object of sub-class
	                //constructor of parent class is auto called 
}
}

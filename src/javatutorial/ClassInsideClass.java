package javatutorial;
class Outer{
	void show() {
		System.out.println("Inside outer class");
	}
	class Inner{
		void display() {
			System.out.println("Inside inner class");
		}
	}
}

public class ClassInsideClass {
public static void main(String args[])
{
	Outer obj = new Outer();
	obj.show();
	Outer.Inner obj1 = obj.new Inner();
	obj1.display();
	
}
}

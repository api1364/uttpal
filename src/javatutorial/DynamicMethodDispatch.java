package javatutorial;
 class X{
	public void show() {
		System.out.println("in X");
	}
}
class Y extends  X{
	public void show() {
		System.out.println("in Y");
	}
}
class Z extends X{
	public void show() {
		System.out.println("In Z");
	}
}
public class DynamicMethodDispatch {
public static void main(String args[])
{
	X obj = new Y();//Runtime polymorphism Refrence of class X and object of class Y
	obj.show();
	obj = new Z();
	obj.show();//Dynamic method dispatch
}
}

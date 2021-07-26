package javatutorial;
interface In{
	public void abc();
	public default void display() {//using default keyword we can define method in interface from java 1.8
		System.out.println("in display");
	}
}
class Inter implements In{
	public void abc() {
		System.out.println("In abc");
	}
	public void display() {
		System.out.println("method overriden");//overriding display in extended class
	}
}
public class Interfacewithmethodbody {
public static void main(String args[]) {
	In obj = new Inter();
	obj.abc();
	obj.display();
	
}
}

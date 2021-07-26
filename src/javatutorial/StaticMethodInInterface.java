package javatutorial;
interface Staticmethod {
	int num = 5;//variable inside a interface is final by default
	public void show();
	static void display() {
		System.out.println("use of static method in interface");
	}
}
public class StaticMethodInInterface {
	public static void main(String args[]) {
		Staticmethod.display();
	}

}

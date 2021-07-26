package javatutorial;
class Method1{
	public void show() {
		System.out.println("in method 1");
	}
}
class Method2 extends Method1{
	public void show() {
		super.show();
		System.out.println("in method 2");
	}
}

public class MethodOverride{
	public static void main(String args[]) {
		Method2 obj = new Method2();
		obj.show();
	}
}
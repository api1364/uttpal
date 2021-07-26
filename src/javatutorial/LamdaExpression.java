package javatutorial;
interface Intf{
	void show();
}
public class LamdaExpression {
public static void main(String args[]) {
	Intf obj = () -> System.out.println("lamda expression");//only possible with interface having only one method
	obj.show();
}
}

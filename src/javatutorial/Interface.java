package javatutorial;
interface I{
	void show();//can not define the body of method of interface ,method are  by default public and final
}
class Implementor implements I{
	public void show() {
		System.out.println("in implementro");
	}
}
public class Interface {
	public static void main(String args[]) {
I obj = new Implementor();//refrence of interface is created not object
obj.show();
}}

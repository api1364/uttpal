package javatutorial;
//when we use a final with variable it become constant
//when we use a final with a method it become no one can override it
// when we use a final with a classs no one can extend it
class Uttpal{
	public void Show() {
		System.out.println("in uttpal show");
	}
}
class Ujjwal extends Uttpal{
	public void Show() {
		System.out.println("in ujjwal show");
	}
}

public class FinalKeyword {
public static void main(String args[]) {
	Ujjwal obj = new Ujjwal();
	obj.Show();
}
}

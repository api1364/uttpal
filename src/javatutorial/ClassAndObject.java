package javatutorial;
class calci
{
	int num1;//variable
	int num2;
	int result;
	public void addition()//method
	{
		int result = num1 + num2;
		System.out.println(result);
	}
}

public class ClassAndObject {
	
	public static void main(String args[]) {
		calci cal= new calci();
		cal.num1 = 3;
		cal.num2 = 6;
		cal.addition();	
	}

}

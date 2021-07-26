package javatutorial;

class Casio
{
	public Casio() 
	{
		
		System.out.println("Default Constructor called");
	}
	public Casio(int num) 
	{
		System.out.println("Constructor overloaded");
	}
	public void add(int i, int j) 
	{
		System.out.println(i+j);
	}
	public void add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
}


public class MethodOverloading {
	public static void main(String args[]) {
		Casio obj = new Casio();
		obj.add(5, 6);
		obj.add(1, 01, 01);
	}

}

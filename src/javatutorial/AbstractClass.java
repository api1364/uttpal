package javatutorial;
abstract class Writer{
	public abstract void write();
}
class Pen extends Writer{
	public void write()
	{
		System.out.println("writing via pen");
		
	}
}
class Pencil extends Writer{
	public void write()
	{
		System.out.println("writing via pencil");
		
	}
}

public class AbstractClass {
public static void main(String args[]) {
	Writer p1 = new Pen(); 
	p1.write();
	Pencil p2 = new Pencil();
	p2.write();
}
}

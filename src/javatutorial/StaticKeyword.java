package javatutorial;
//use of static keyword
 class Emp {
int id;
int salary;
static String ceo;
static{
	ceo = "uttpal";
}
public void display(int x, int y)
{
	id = x;
	salary = y;
	
	System.out.println(id+":"+salary+":"+ceo);
}
}
public class StaticKeyword{
	public static void main(String args[]) {
		Emp uttpal = new Emp();
		uttpal.display(5, 3);
		Emp ujjwal = new Emp();
		ujjwal.display(6, 9);
//		uttpal.display();
//		ujjwal.display();
	}
}
package javatutorial;
//Encapsulation = Data binding with the help of method
class Student{
	private int rollnum;
	private String name;
	public int getRollnum() {
		return rollnum;
	}
	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class Encapsulation {
public static void main(String args[]) {
	Student s1 = new Student();
	s1.setRollnum(5);
	s1.setName("uttpal");
	System.out.println("name is "+s1.getName());
	System.out.println("roll NUmber is"+s1.getRollnum());
	

}
}

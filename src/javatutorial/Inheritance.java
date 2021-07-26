package javatutorial;
class Calculator{ ///parent class
	public void add(int i, int j) {
		System.out.println(i+j);
	}
}
class AdvCalculator extends Calculator{ //child class also inherits the property of parent class
	public void sub(int i, int j) {
		System.out.println(i-j);
	}
}
class VeryAdvCalculator extends AdvCalculator{  //multilevel inheritance as we are inherit the propery of child 
	public void multiply(int i, int j) {  // into another child class
		System.out.println(i*j);
	}
}
public class Inheritance {
public static void main(String args[]) {
	VeryAdvCalculator obj = new VeryAdvCalculator();
	obj.add(5, 3);//we are callling the method of parent class using the object of child class as we have inherit 
	obj.sub(5, 3);//the class
	obj.multiply(5, 3);
}
}

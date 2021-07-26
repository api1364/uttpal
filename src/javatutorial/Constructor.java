package javatutorial;
//constructor is a member method
//constructor has same name as class
//does not return
//used to allocate memory
//one class can have more than one constructor with the same name but different parameter that is called constructor overloading;
//default constructor -> no parameter auto called
class A{
	int num1;
	int num2;
	int result;
	public A() {
		System.out.println("Constructor is called");
	}
	public void A(int a, int b) {
		this.num1 = a;
		this.num2 = b;
		result = num1+num2;
		System.out.println(result);
		
	}
}
class Constructor{
	public static void main(String args[]) {
		A obj = new A();
		obj.A(5, 6);
		
	}
}

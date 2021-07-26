package javatutorial;

public class ExceptionHandling {
public static void main(String args[]){
	try {
		int array[]=null;
		//a[6] = 6;
		int i =4;
		int j= 5;
		int k = i/j;
		System.out.println(k);
	}
	catch(ArithmeticException e) 
	{
		System.out.println("Arithmetic error");
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Stay in limit");
	}
	catch(Exception e) {//handles any exception
		System.out.println("something iss wrong");
	}
//	finally {
//		System.out.println("ha ha ah");
//	}
}
}

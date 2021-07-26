package javatutorial;
public class UttpalException extends Exception {
	public UttpalException(String s)
	{
		super(s);
	}
}
public class ExceptionDemo {
public static void main(String args[]) {
	int i = 4;
	int j = 3;
	try {
		int k =i/j;
		if(k==0) {
			throw new UttpalException("this is not possible");
			
		}
		
	}
	catch(UttpalException e)
	{
		System.out.println("error"+e.getMessage());
	}
	
}
}

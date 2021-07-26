package javatutorial;
//primitive works faster as compare to wrapper
// there are some framework that work on only wrapper like API
public class Wrapper {
public static void main(String args[]) {
	int i = 4;//primitive variable
	Integer j = new Integer(i);//passing primitive variable to Wrapper class //Boxing
	int k = j.intValue(); //unboxing //wrapper class to primitive
	Integer l = i; //Auto-Boxing //directly assigning primitive to Wrapper class
	int m = l; // Auto-Unboxing
	System.out.println(j);
	System.out.println(k);
	System.out.println(l);
	System.out.println(m);
}
}

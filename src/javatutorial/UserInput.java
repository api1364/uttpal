
package javatutorial;
import java.util.Scanner;

public class UserInput {
public static void main(String args[]) {
	int n;
	System.out.println("enter a number");
	Scanner sc = new Scanner(System.in);
	n=sc.nextInt();
	System.out.println("user entered number is "+n);
}
}

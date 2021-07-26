package javatutorial;
class Add{
	public void add(int ...n) { //it can take any number of input in the method also called variable length argument
		int sum = 0;
		for(int i: n) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}

public class SpecialArray {
public static void main(String args[]) {
	Add obj = new Add();
	obj.add(5,6,3);
}
}

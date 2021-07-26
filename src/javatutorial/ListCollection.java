package javatutorial;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListCollection {
public static void main(String args[]) {
	List values = new ArrayList();
	values.add(3);// Integer class i.e wrapper class
	values.add(5);
	values.add(7);//passing it as object not variable
	values.add(2, 10);
	values.add("String");//we can add string values as well
	//this method is available in List we can add element at any index
//	Iterator it = values.iterator();//iterator method is defined in Iterator interface
//	while(it.hasNext()) {//hasNext return boolean value next element is available or not
//		System.out.println(it.next());
//	}
//	for(int i=0;i<values.size();i++) {            //accesing the value of list using for loop
//		System.out.println(values.get(i));
//	}
	for(Object o : values) {
		System.out.println(o);
	}
	
}
}

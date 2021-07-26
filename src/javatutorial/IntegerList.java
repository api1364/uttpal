package javatutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> values  = new ArrayList<>();//List of Integer //MUTABLE
values.add(4);
values.add(8);
values.add(1);
values.add(9);
Collections.sort(values);//Sort the List
Collections.reverse(values);//Reverse the list
Collections.shuffle(values);//Shuffle the values
//values.add("String value"); //It will give error as we have declared list as Integer class
for(int o : values)
{
	System.out.println(o);
}
	}

}

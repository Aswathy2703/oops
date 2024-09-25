package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Clear {

	public static void main(String[] args) {
		List<String>obj=new ArrayList <String>();
		//add elements to list
		obj.add("Aswathy");
		obj.add("Karthika");
		obj.add("Asheena");
		obj.clear();//method in java to remove all items from the list
		System.out.println(obj);
	}

}

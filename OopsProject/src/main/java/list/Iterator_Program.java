package list;

import java.util.*;
import java.util.List;

public class Iterator_Program {

	public static void main(String[] args) {
		List<String>obj=new ArrayList <String>();
		//add elements to list
		obj.add("Aswathy");
		obj.add("Karthika");
		obj.add("Asheena");
		Iterator<String>it=obj.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// Iterator to store same and different type of elements
	}

}

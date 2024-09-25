package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Remove {

	public static void main(String[] args) {
		List obj=new ArrayList();
		//add elements to list
		obj.add(5);
		obj.add(2.5f);
		obj.add("Aswathy");
		obj.add("Karthika");
		obj.add("Asheena");
		obj.remove(3);//3 index of the list to remove
		Iterator it=obj.iterator(); //another method to print 
		while(it.hasNext()) {
			System.out.println(it.next()); //use in both generic and non generic
				//System.out.println(obj);
	}

}

package hashset;

import java.util.HashSet;
import java.util.Set;

public class Hashset_Programs {

	public static void main(String[] args) {
		Set<String>obj=new HashSet <String>();// if store in set
		/*obj.add("Aswathy");
		obj.add("Karthika");
		obj.add("Asheena");
		System.out.println(obj);*/
//1. contains()
		obj.add("Aswathy");
		obj.add("Karthika");
		obj.add("Asheena");
		//System.out.println(obj.contains("Aswathy"));
		//System.out.println(obj.contains("Arathi"));
//2.remove()
		//obj.remove("Karthika");
		//System.out.println(obj);
//3.clear()
		//obj.clear();
		//System.out.println(obj);
//4.size()
		System.out.println(obj.size());
		
	}

}

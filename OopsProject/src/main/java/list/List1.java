package list;

import java.util.*;//all class and interface are imported


public class List1 {

	public static void main(String[] args) {
		List<String>obj=new ArrayList <String>();
		//add elements to list
		obj.add("Aswathy");
		obj.add("Karthika");
		obj.add("Asheena");
/*print all element in list one by one use for each loop
		for(String temp:obj) {
			System.out.println(temp);
		}*/
		System.out.println(obj);// print all elements as a list

	}

}

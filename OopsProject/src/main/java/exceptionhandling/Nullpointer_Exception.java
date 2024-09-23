package exceptionhandling;

public class Nullpointer_Exception {

	public static void main(String[] args) {
		try {
			String s=null;
			System.out.println(s.length());
		}
		catch(Exception e){// Exception is the class
			System.out.println("Exception Handled");
			System.out.println(e);

	}

}

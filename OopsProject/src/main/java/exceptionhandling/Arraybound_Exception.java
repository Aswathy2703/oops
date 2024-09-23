package exceptionhandling;

public class Arraybound_Exception {

	public static void main(String[] args) {
		try {
			int arr[]=new int[5];
			arr[8]=9;
		}
		catch(Exception e){// Exception is the class
			System.out.println("Exception Handled");
			System.out.println(e);
	}
	}
}

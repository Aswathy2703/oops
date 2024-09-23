package exceptionhandling;

public class Arithmetic_Exceptionhandling {

	public static void main(String[] args) {
	try {
		int a=10/0; //arithmetic exception
	}
	catch(Exception e){// Exception is the class
		System.out.println("Exception Handled");
		System.out.println(e);
	}
	}

}

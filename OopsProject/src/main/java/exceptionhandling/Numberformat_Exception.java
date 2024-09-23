package exceptionhandling;

public class Numberformat_Exception {
	public static void main(String[] args) {
		try {
			String s="Hello";
			int n=Integer.parseInt(s);//string to integer convert 
		}
		catch(Exception e){// Exception is the class
			System.out.println("Exception Handled");
			System.out.println(e);
	}
	}
}

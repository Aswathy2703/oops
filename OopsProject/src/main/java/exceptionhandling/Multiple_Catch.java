package exceptionhandling;

public class Multiple_Catch {

	public static void main(String[] args) {
		try {
			int a=7/0;//if a=7/5; exceute finally keyword
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception handled");
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Point Exception handled");
			System.out.println(e);
		}
		catch(NumberFormatException e) {
			System.out.println("Number Format Exception handled");
			System.out.println(e);
		}
		finally {
			System.out.println("Welcome");
		}
	}

}

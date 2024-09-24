package exceptionhandling;

public class Throws_Exception {

	public static void display(int age) {
		if(age<18) {
			throw new ArithmeticException("Not Eligible for Voting");
		}
		else {
			System.out.println("Eligible for Voting");
		}
	}
public static void main(String[] args) {
	Throws_Exception obj=new Throws_Exception ();
	obj.display(13);
}

}

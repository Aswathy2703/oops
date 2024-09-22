package superpackage;

public class Car extends Vehicle{
	public void speed() {
		super.speed(); //immediate parent class method is invoked
		System.out.println("Audi");
		super.speed(); //to get parent after child, 
		//if super.method() is provide above sysout parent will get before child.
	}
	public static void main(String args []){
		Car obj=new Car();
		obj.speed();
		
	}
}

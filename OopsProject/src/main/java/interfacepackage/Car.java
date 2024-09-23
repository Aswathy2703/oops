package interfacepackage;

public class Car implements Vehicle {
	public void show() {//abstract method implementation
		System.out.println("Speed");
	}

	public static void main(String[] args) {
		Car obj=new Car();
		obj.show();
	}

}

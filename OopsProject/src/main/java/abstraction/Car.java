package abstraction;

public class Car extends Vehicle {
	public void milage() {
		System.out.println(8);
	}
	public static void main(String[] args) {
		Vehicle obj=new Car();
		obj.milage();
		obj.speed();
	}

}

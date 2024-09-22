package finalpackage;

public class Vehicle {
	//int speed=90;
	final int speed=90;
	public void speed() {
		speed=60;
		System.out.println(speed);
	}
	public static void main(String[] args) {
		Vehicle obj=new Vehicle();
		obj.speed();
	}

}

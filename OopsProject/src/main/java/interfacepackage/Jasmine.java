package interfacepackage;

public class Jasmine implements Flower{
	public void colour() {
		System.out.println("White Colour");
	}

	public static void main(String[] args) {
		//Flower obj=new Jasmine();
		Flower obj=new Rose();
		obj.colour();

	}

}

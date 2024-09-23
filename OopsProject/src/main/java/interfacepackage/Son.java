package interfacepackage;

public class Son extends Father {
	public void display() {
		System.out.println("Black Eyes");
	}

	public static void main(String[] args) {
		//Son obj=new Son();
		Father obje =new Father();
		Grandparent obj=new Son();
		//obj.display();
		obje.display();
	}

}

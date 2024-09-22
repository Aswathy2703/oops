package singleinheritance;

public class Puppy_Child extends Dog_Parent{
	public void sleep() {
		System.out.println("Sleeping");
	}
	public static void main(String[] args) {
		Puppy_Child object=new Puppy_Child();
		object.sleep();
		object.run();

	}

}

package abstraction;

public class Dog extends Animal {
	public void run() {
		System.out.println("Running");
	}
	public static void main(String[] args) {
		Dog obj=new Dog();
		obj.run();
		obj.sleep();
	}

}

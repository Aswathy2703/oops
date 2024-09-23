package review;

public class Child implements Grand_Parent,Parent{
	public void display1() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		Child obj=new Child();
		obj.display1();
		//obj.display();
		//obj.show();
	}

}

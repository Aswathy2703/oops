package multipleinheritance;

public class Child extends Grand_Parent extends Parent{

	public void lips() {
		System.out.println("Rose Lips");
	}

	public static void main(String[] args) {
	Child obj=new Child();
	obj.lips();
	obj.hair();
	obj.eyes();

	}

}

package multipleinheritance;

public class Child implements Father,Mother{
//void eyes() {
	//System.out.println("Blue Eyes");
//}
	public void lips() {
		System.out.println("Rose Lips");
	}

	public static void main(String[] args) {
	Child obj=new Child();
	//obj.lips();
	obj.hair();
	//obj.eyes();

	}

}

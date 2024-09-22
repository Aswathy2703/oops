package multilevelinheritance;

public class Grand_Child extends Parent{
	public void lips() {
		System.out.println("Rose Lips");
	}

	public static void main(String[] args) {
	Grand_Child obj=new Grand_Child();
	obj.lips();
	obj.cheeks();
	obj.eye();

	}

}

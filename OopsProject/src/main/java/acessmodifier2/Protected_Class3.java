package acessmodifier2;
//access with the help of child class
public class Protected_Class3 extends Protected_Class1{

	public static void main(String[] args) {
		Protected_Class3 obj=new Protected_Class3();//created the child class obj and access parent class
		obj.show();
		System.out.println(obj.a);

	}

}

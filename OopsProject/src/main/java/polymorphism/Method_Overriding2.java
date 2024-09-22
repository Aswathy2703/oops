package polymorphism;

public class Method_Overriding2 extends Method_Overriding1 {
			public void display() {	
		System.out.println("Hello");
		
	}
		public static void main(String[] args) {
			Method_Overriding2 object=new Method_Overriding2();
			object.display();// get results of child class only
			//parent class property can be obtained using "super" keyword
			

		}

		}
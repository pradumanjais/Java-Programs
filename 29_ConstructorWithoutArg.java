package java_programs;

public class ConstructorWithoutArg {
	
	// Creating Constructor
	public ConstructorWithoutArg() {
		
		System.out.println("This is Constructor");
	}
	
	// Creatin Methods
	public void method1() {
		
		System.out.println("This is Method");
	}

	public static void main(String[] args) {
		
		ConstructorWithoutArg obj = new ConstructorWithoutArg();
		obj.method1();
	}

}

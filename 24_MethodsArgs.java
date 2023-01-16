package java_programs;

public class MethodsArgs {

	// Creating method with argument
	public static void add(int num1, int num2) {
		
		System.out.println(num1+num2);
		
	}
	
	public void multiply(int num1,int num2) {
		
		System.out.println(num1*num2);
	}
	
	public static void main(String[] args) {

		// Calling the Method
		add(10,20);
		add(23,28);
		
		MethodsArgs obj = new MethodsArgs();
		
		obj.multiply(5,6);
		
	}

}

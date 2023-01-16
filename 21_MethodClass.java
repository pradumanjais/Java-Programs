package java_programs;

public class MethodClass {
	
	// Creating Static Method
	public static void m1() {
		
		int a = 20; int b = 40;
		System.out.println(a+b);
	}
	
	// Creating Non Static Method
	public void m2() {
		int a = 10; int b = 15;
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		
		// Calling Static Method
		m1();
		
		// Calling Non Static Method
		MethodClass obj = new MethodClass();
		obj.m2();
		
	}

}

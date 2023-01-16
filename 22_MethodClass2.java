package java_programs;

public class MethodClass2 {

	public static void main(String[] args) {
		
		// Calling Static Method
		MethodClass.m1();
		
		// Calling Non Static Method
		MethodClass obj = new MethodClass();
		obj.m2();
	}

}

package java_program;

import java_programs.MethodClass;

public class MethodClass3 {

	public static void main(String[] args) {
		
		// Calling Static Method
		MethodClass.m1();
		
		// Calling Non Static Method
		MethodClass obj = new MethodClass();
		obj.m2();

	}

}

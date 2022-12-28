package java_program;

import java_programs.NonStaticVar;

public class NonStaticVarAccess {

	public static void main(String[] args) {
		
		NonStaticVar obj1 = new NonStaticVar();
		
		System.out.println(obj1.a+obj1.b);

	}

}

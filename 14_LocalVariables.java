package java_programs;

public class LocalVariables {
	
	public static void fun1() {
		// local variable
		int a = 20; int b = 30;
		System.out.println(a+b);
	}
	
	public static void fun2() {
		// local variables
		int a = 60; int b = 70;
		System.out.println(a+b);
	}
	

	public static void main(String[] args) {
		
		int a = 11; int c = 12; // local variables
		System.out.println(a+c);
		fun1();
		fun2();
	}

}

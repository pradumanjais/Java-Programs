package java_programs;

public class MethodClass4 {

	public static int a = 20;
	public int b = 40;
	
	public static void m1() {
		
//		System.out.println(a+obj.b); must create obj to access non static variable.
		System.out.println(a);
	}
	
	public void m2() {
		
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		m1();
		
		MethodClass4 obj = new MethodClass4();
		obj.m2();
	}

}

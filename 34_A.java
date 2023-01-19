package oops_concept;

class B {
	String a = "Class A";
}

public class A extends B {
	
	String a = "Class B";
	
	public void m1() {
		System.out.println(this.a);
		System.out.println(super.a);
	}

	public static void main(String[] args) {
	
		A obj = new A();
		obj.m1();
	}

}

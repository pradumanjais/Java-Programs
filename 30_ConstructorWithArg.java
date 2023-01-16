package java_programs;

public class ConstructorWithArg {
	
	// Creating Variable
	int a; int b;
	
	// Creating Constructor with Arg
	public ConstructorWithArg(int m1, int m2) {
		
		a = m1;
		b = m2;
	}
	
	// Creatin Methods
	public void total() {
		
		System.out.println(a+b);
	}
	
	public void average() {
		
		System.out.println((a+b)/2);
	}


	public static void main(String[] args) {
		
		ConstructorWithArg s1 = new ConstructorWithArg(48,80);
		s1.total();
		s1.average();
		
		ConstructorWithArg s2 = new ConstructorWithArg(40,80);
		s2.total();
		s2.average();
	}

}

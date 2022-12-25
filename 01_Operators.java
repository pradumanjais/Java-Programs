package java_programs;

public class Operators {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 30;
		int c =10;
		
		// Arithmetic Operator
		System.out.println("Arithmetic Operation");
		System.out.println(a+b);
		System.out.println(b-a);
		System.out.println(a*b);
		System.out.println(a/c);
		System.out.println(a%c);
		
		// Conditional Operator
		System.out.println("\nConditional Operator");
		System.out.println(a>b);
		
		// Logical Operator
		System.out.println("\nLogical Operator");
		System.out.println(a<b && a!=b);
		System.out.println(a<=b || a==b);
		System.out.println(a!=b && b==c);
		
		System.out.println(a>=b || a!=c && a<c && a>b);

	}

}

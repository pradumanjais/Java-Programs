package java_programs;

public class AccessSpecifiers {
	
	// Creating variables with all the access specifiers.
	
	public static int a = 10; // can be accessed anywhere.
	protected static int b = 20; // can be accessed anywhere in same package.
	private static int c = 30; // can be accessed only in same class.
	static int d = 40; // can be accessed anywhere in same package.

	public static void main(String[] args) {
		
		System.out.println(a+b+c+d);

	}

}

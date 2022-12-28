package java_programs;

public class NonStaticVar {
	
	public int a = 10;
	public int b = 15;

	public static void main(String[] args) {
		
		//Creating Object
		NonStaticVar obj = new NonStaticVar();
		System.out.println(obj.a+obj.b);
	}

}

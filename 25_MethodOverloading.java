package java_programs;

public class MethodOverloading {
	
	public static void openResult(int rollNum) {
		
		System.out.println("Result for Roll number: "+rollNum+" Opened Successfully");
	}
	
	public static void openResult(String name) {
		
		System.out.println("Result for name: "+name+" Opened Successfully");
	}
	
	public static void openResult(String lastName, int className) {
		
		System.out.println("Result for name: "+lastName+" and class : "+className+" Opened Successfully");
	}

	public static void main(String[] args) {
		
		openResult(77);
		openResult("John");
		openResult("Doe",7);
	}

}

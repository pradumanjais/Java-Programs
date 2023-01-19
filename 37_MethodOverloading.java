package oops_concept;

// method overloading known as compile time polymorphism
public class MethodOverloading {
	
	public void openSheet(int num) {
		
		System.out.println("Sheet opened with Rollnumber: "+num);
	}
	
	public void openSheet(String name) {
		System.out.println("Sheet opened with name: "+name);
	}

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.openSheet(101);
		obj.openSheet("Taksh");
		obj.openSheet("Acp");
	}

}

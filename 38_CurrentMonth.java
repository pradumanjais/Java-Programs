package oops_concept;

// method overriding known as runtime polymorphism
class Jan {
	public void roi() {
		System.out.println("8.1 %");
	}
}

class Feb extends Jan {
	public void roi() {
		System.out.println("8.3 %");
	}
}

class March extends Feb {
	public void roi() {
		System.out.println("8.35 %");
	}
}

public class CurrentMonth extends March {
	
	public void roi() {
		System.out.println("8.6 %");
	}

	public static void main(String[] args) {
		
		CurrentMonth obj = new CurrentMonth();
		obj.roi();
	}

}

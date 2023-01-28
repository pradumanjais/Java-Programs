package oops_concept;

// abstraction
// abstract class must have atleast one abstract method.
abstract class FirstRelease{
	
	public void classRoom() {
		System.out.println("Class Training is Started...");
	}
	
	public abstract void online();
	public abstract void corporate();
}

abstract class SecondRelease extends FirstRelease {
	
	public void online() {
		System.out.println("Online Training is Started...");
	}
}

public class FinalRelease extends SecondRelease {
	
	public void corporate() {
		System.out.println("Corporate Training is Started...");
	}

	public static void main(String[] args) {
		
		FinalRelease f = new FinalRelease();
		
		f.classRoom();
		f.online();
		f.corporate();

	}

}

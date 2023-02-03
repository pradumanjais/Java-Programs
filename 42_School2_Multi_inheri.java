package oops_concept;

interface Software {
	
	public void startDate();
	public void endDate();
	public void fee();
}

interface Software2 {
	public void time();
}

class School1 implements Software {

	@Override
	public void startDate() {
		System.out.println("4th July");
	}

	@Override
	public void endDate() {
		System.out.println("22nd April");
	}

	@Override
	public void fee() {
		System.out.println("50000");
	}
	
	public void sports() {
		System.out.println("Football");
	}
}

public class School2_Multi_inheri implements Software, Software2 { // Multiple Inheritance

	@Override
	public void startDate() {
		System.out.println("20th July");
	}

	@Override
	public void endDate() {
		System.out.println("2nd May");
	}

	@Override
	public void fee() {
		System.out.println("80000");
	}
	

	@Override
	public void time() {
		System.out.println("11 AM to 5 PM");
	}
	
	public static void main(String[] args) {
		Software s1 = new School1();
		s1.startDate();
		s1.endDate();
		s1.fee();
		
		School1 ss1 = new School1();
		ss1.sports();
		
		System.out.println();
		
		Software s2 = new School2_Multi_inheri();
		s2.startDate();
		s2.endDate();
		s2.fee();
		
		Software2 s22 = new School2_Multi_inheri();
		s22.time();
	}


}
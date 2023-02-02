package oops_concept;

class Encapsulation{
	
	private String name;
	private int age;
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		if(name.length()<4 || name.length()>12)
			throw new RuntimeException("Name should accept 4 to 12 Characters");
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		if(age<18 || age>60)
			throw new RuntimeException("Age should be in between 18 to 60");
		this.age = age;
	}

}


public class EncapsulationClass {

	public static void main(String[] args) {
		
		Encapsulation obj = new Encapsulation();
		
		obj.setAge(19);
		obj.setName("John");
//		obj.setAge(17); // throw error.
		String name = obj.getName();
		int age = obj.getAge();
		System.out.println(name +"  "+ age);
		
	}

}

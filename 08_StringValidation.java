package java_programs;

public class StringValidation {

	public static void main(String[] args) {
		
		String a = "Praduman QA";
		String b = "Java Classes";
		String c = "Praduman qa";
		
		// var.length() -> is used to find the length of a string.
		System.out.println("Length of a = "+a.length());
		System.out.println("Length of b = "+b.length());
		
		// var.startsWith("expected text") -> to verify whether the string is starting with specific character or not.
		System.out.println(b.startsWith("Java")); // true
		System.out.println(b.startsWith("Classes")); // false
		System.out.println(b.startsWith("java")); // false
		
		// var.endsWith("expected text") -> to verify whether the string is ending with specific character or not.
		System.out.println(b.endsWith("Java")); // false
		System.out.println(b.endsWith("es")); // true
		
		// var.toLowerCase() -> to convert string in lower case.
		System.out.println(a.toLowerCase());
		
		// var.toUpperCase() -> to convert string in lower case.
		System.out.println(a.toUpperCase());
		
		// var1.equals(var2) -> to verify whether one string is equal to another or not.
		System.out.println(a.equals(c)); // false
		
		// var1.equalsIgnoreCase(var2) -> to verify whether variable is same as another variable or not irrespective of case. 
		System.out.println(a.equalsIgnoreCase(c)); // true
		
		// var.contains("value") -> to verify whether the string contains specific value or string or not.
		System.out.println(a.contains("praduman")); // false
		System.out.println(a.contains("Praduman")); // true
		
		// var1.concat(var2) -> used to concat strings.
		System.out.println(a.concat(b));
		System.out.println(a+b);

		// var.charAt(index no) -> to verify which character is available in which index of the string.
		System.out.println(a.charAt(4));
		
		// var.indexOf(char) -> to verify in which Index which character is available.
		System.out.println(a.indexOf('u'));

		// var.trim() -> we are using this function to eliminate starting and ending spaces of the string(first and last spaces)
		System.out.println(d);
		System.out.println(d.trim());
		
		// var.replace("Old character/String", "New Character/String") -> to replace old characters or Strings with new characters or strings in a var.
		System.out.println(b.replace("J", "Z"));
	}

}

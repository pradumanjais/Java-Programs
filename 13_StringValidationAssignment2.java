package java_programs;

public class StringValidationAssignment2 {

	public static void main(String[] args) {
		
		String a = "abcd";
		String b = "xyz";
		String c = "abcd xyz klmn 1234 4567";
		
		// req1: Length of the a variable >b and <c var.
		if(a.length()>b.length()&&a.length()<c.length()) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		// req2: concat a and b var and verify length should be less than c var length or > 5.
		String ans = a+b;// a.concat(b)
		if(ans.length()<c.length()||ans.length()>5)
		{
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail"); 
		}
		
		// req3: a var should start with "ab" and b var should not end with "yz"
		if(a.startsWith("ab")&&b.endsWith("yz")!=true)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		// req 4: c var should contain space and should not contain 9.
		if(c.contains(" ")&&c.contains("9")!=true)
		{
			System.out.println("Pass");
		}
		else
		{ 
			System.out.println("Fail");
		}
		
		// req 5: 7th position in a c variable should be y or z and k should be available in either 10th or 11th positions.
		String str[] = c.split("");
		if((str[6].contains("y")||str[6].contains("z"))&&(str[9].contains("k")||str[10].contains("k")))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail"); 
		}
		
		// req 6: split c var into multiple strings with""(space and verify length of the array should be 4 or 5. 
		String str1[] = c.split(" ");
		if(str1.length==4||str1.length==5)
		{
			System.out.println("Pass");
				
		}
		else {
				System.out.println("Fail");
		}
		
		//req7: verify first string of the c variable should be same as a var and should not be same as 3rd string of the c var.
		if(str1[0].contains(a)&&str1[0].contains(str1[2])!=true) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}
}

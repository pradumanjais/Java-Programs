package java_programs;

public class SplitMethod {

	public static void main(String[] args) {
		
		String s = "Acp QA Automation Classes";
		String str[] = s.split(" ");
		
		for(int i=0; i<str.length;i++) {
			System.out.print(str[i]+" ");
		}
		
		System.out.println();
		for(int i=str.length-1; i>=0;i--) {
			System.out.print(str[i]+" ");
		}
		
		String str1[] = s.split("");
		
		System.out.println();
		for(int i =str1.length-1; i>=0;i--) {
			System.out.print(str1[i]+"");
		}
		
	}

}

package java_programs;

public class SplitMethodExercise {

	public static void main(String[] args) {
		
		// Print the string having the length 3.
		String a = "QA @ Automation abc Classes 123 XYZ";
		String str[] = a.split(" ");
		
		for(int i=0;i<str.length;i++) {
			if(str[i].length()==3) {
				System.out.println(str[i]);
			}
		}

	}

}

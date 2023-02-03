package java_programs;

public class SumAndAvgOfArray {

	public static void main(String[] args) {
		
		int sum = 0;
		int[] age = {66, 44, 23, 13, 72};
		
		for(int data:age) {
			sum = sum+data;
		}
		
		System.out.println("Sum of age is: "+sum);
		System.out.println("Average age is: "+sum/age.length);
	}

}

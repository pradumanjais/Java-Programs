package java_programs;

public class ArrayBasic {

	public static void main(String[] args) {
		
		int[] arr; // Array Declaration
		arr = new int[10]; // Memory Declaration
		
		//int[] arr = new int[10]; // it will also works
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		int[] age = {10, 50, 40, 60, 44};
		
		String[] name = {"Pramod", "Vishal", "Aman"};
		
		System.out.println(arr[5]); // print default value i.e 0
		System.out.println(age[3]);
		System.out.println(name[2]);
		System.out.println(name.length);
		
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i]+" ");
		}
		
		// using for-each loop
		System.out.println();
		
		for(String result : name) {
			System.out.print(result+" ");
		}
	}

}

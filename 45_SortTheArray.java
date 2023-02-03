package java_programs;

import java.util.Scanner;

public class SortTheArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] age;
		int size;
		System.out.println("Enter the size of the array");
		size = scanner.nextInt();
		
		age = new int[size];
		
		System.out.println("Enter the elements of the array");
		for(int i=0;i<age.length;i++) {
			age[i] = scanner.nextInt();
		}
		int temp;
		for(int i=0;i<age.length;i++) {
			for(int j=i+1;j<age.length;j++) {
				
				if(age[i]>age[j]) {
					temp = age[i];
					age[i] = age[j];
					age[j] = temp;
				}
			}
		}
		
		System.out.println("Sorted Array elements are: ");
		for(int i=0;i<age.length;i++) {
			System.out.print(age[i]+" ");
		}
	}

}

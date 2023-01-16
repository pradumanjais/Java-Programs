package java_programs;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		// Importing Scanner Class Object
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the A value");
		int a = sc.nextInt();
		
		System.out.println("Enter the B value");
		int b = sc.nextInt();
		
		System.out.println("Addition is: " + (a+b));
	}

}

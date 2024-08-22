package javatest;

import java.util.Scanner;

public class CompareSums {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter the vlalue of a:");
		int a = scanner.nextInt();
		
		System.out.print("Enter the vlalue of b:");
		int b = scanner.nextInt();
		
		System.out.print("Enter the vlalue of c:");
		int c = scanner.nextInt();
		
		System.out.print("Enter the vlalue of d:");
		int d = scanner.nextInt();
		
		int sumAB=a+b;
		int sumCD=c+d;
		
		if (sumAB>sumCD) {
			System.out.println("The sum of a and b is greater than sum of c and d.");
		}else if (sumAB<sumCD) {
			System.out.println("The sum of a and b is less than the sum of c and d.");
		}else {
			System.out.println("The sum of a and b is equal to the sum of c and d.");
		}
		
		scanner.close();

	}

}

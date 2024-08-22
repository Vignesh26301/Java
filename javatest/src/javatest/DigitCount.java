package javatest;

import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter an integer:");
		int number=scanner.nextInt();
		
		int digitcount= countDigits(number);
		
		System.out.println("Number of digits:"+ digitcount);
		
		scanner.close();

	}
	
	public static int countDigits(int number) {
		if (number==0)return 1;
		
		number= Math.abs(number);
		
		int count=0;
		count++;

	return count;
	}

}

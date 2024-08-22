package javatest;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.print("Enter a number:");
		int number =scanner.nextInt();
		
		boolean isprime=true;
		
		if(number<=1) {
			isprime= false;
		}else {
			for(int i=2;i<= Math.sqrt(number);i++) {
				if (number%i==0) {
					isprime=false;
					break;
				}
			}
		}
		
		if(isprime) {
			System.out.println(number+"is a prime number.");
		}else {
			System.out.println(number +"is not aprime number.");
		}
		
		scanner.close();

	}

}

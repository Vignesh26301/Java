package javatest;

import java.util.Scanner;

public class AgeValidataor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your age:");
		int age = scanner.nextInt();
		
		if(isValidAge(age)) {
			System.out.println("Age is valid.");
		} else {
			System.out.println("Age is not valid.");
		}
		scanner.close();
		
	}
	public static boolean isValidAge(int age) {
		return age>=21;
		}

	}



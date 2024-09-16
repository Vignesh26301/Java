package javatest;

import java.util.Scanner;

public class DivisionWithExceptionHandling {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("Enter the first integer:");
			int numerator =scanner.nextInt();
			
			System.out.print("Enter the second integer:");
			int denominator = scanner.nextInt();
			
			int result = numerator/denominator;
			
			System.out.println("Result of division:"+ result);
		} catch (ArithmeticException e) {
			
			System.out.println("Error: Division by zero is not allowed:");
		}catch (Exception e) {
			
			System.out.println("Error: Invalid input. please enter valid integers.");
		} finally {
			
			scanner.close();
					
		}

	}

}

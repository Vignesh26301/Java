package javatest;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of rows:");
		int n =scanner.nextInt();
		scanner.close();
		
		for(int i=n;i>0;i--) {
			
			for (int j=0;j<i;j++) {
				System.out.println("*");
			}
			System.out.println();
			}
		
		for (int i=1;i<=n;i++) {
			System.out.print("*");
		}
		System.out.println();

	}

}

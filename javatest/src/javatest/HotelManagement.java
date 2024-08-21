package javatest;

import java.util.Scanner;

public class HotelManagement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the month(1-12):");
		int month=scanner.nextInt();
		
		System.out.print("Enter the room rent per day:");
		float roomrent=scanner.nextFloat();
		
		System.out.print("Enter the number of days stayed");
		int daysstayed=scanner.nextInt();
		
		scanner.close();
		
		float totalrent=roomrent*daysstayed;
		
		switch(month) {
		case 4:
		case 5:
		case 6:
		case 11:
		case 12:
			totalrent *=1.2;
			break;
		}
		
		System.out.printf("The hotel tariff to be paid id;%2f\n",totalrent);
		}

	}


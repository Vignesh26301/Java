package javatest;

import java.util.Scanner;

public class CalculateGrade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your mark:");
		int mark =scanner.nextInt();
		scanner.close();
		
		String grade;
		
		if (mark>100) {
			grade="invalid mark";
		}else if (mark==100) {
			grade="s";
		}else if (mark>=90) {
			grade ="A";
		}else if (mark>=80) {
			grade ="B";
		}else if (mark>=70) {
			grade ="c";
		}else if (mark>=60) {
			grade ="D";
		}else if (mark>=50) {
			grade ="E";
		}else if (mark>=0) {
			grade ="f";
		}else {
			grade="Invalid mark";
		}
		System.out.println("Your grade is:"+grade);


	}

}

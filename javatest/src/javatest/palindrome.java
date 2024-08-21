package javatest;

import java.util.Scanner;

public class palindrome {
 public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a String:");
	String input =scanner.nextLine();
	scanner.close();
	
	boolean ispalindrome =true;
	int length =input.length();
			
			input =input.toLowerCase();
	
	for(int i=0;i<length/2;i++) {
		if(input.charAt(i)!=input.charAt(length- 1 -i)) {
		ispalindrome =false;
		break;
	}
 }
 if(ispalindrome) {
	 System.out.println("The string \"" + input + "\" is a palindrome.");
 }else {
	 System.out.println("The string\"" +input+"\" is not a palindrome.");
 }
	}
}

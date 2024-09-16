package javatest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadingExample {

	public static void main(String[] args) {
		
		String filepath = "example.txt";
		
		try {
			
			File file = new File(filepath);
			
			Scanner fileScanner = new Scanner(file);
			
			while(fileScanner.hasNextLine()){
				String line = fileScanner.nextLine();
				System.out.println(line);
			}
			
			fileScanner.close();
		} catch (FileNotFoundException e) {
			
			System.out.println("Error: File not foud. please check the file path and try again.");
			}
			
		}
}

package javatest;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		try {
			int[] numbers = {1,2,3};
			System.out.println("Element at index 5:" + numbers[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Array index is out of bounds.");
		}
		
		try {
			String text ="Hello";
			System.out.println("Character at index 10:" + text.charAt(10));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Error: String index is out of bounds.");
			
		}

	}

}

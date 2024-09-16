package javatest;

import java.util.ArrayList;

public class RemoveAllElementsExample {

	public static void main(String[] args) {
		
		ArrayList<String>stringList = new ArrayList<>();
		
		stringList.add("Kumar");
		stringList.add("Krishan");
		stringList.add("Kevin");
		stringList.add("Kannan");
		stringList.add("Gokul");
		
		System.out.println("ArrayList before removal;" + stringList);
		
		stringList.clear();
		
		System.out.println("ArrayList after removal:" + stringList);
		
	}

}

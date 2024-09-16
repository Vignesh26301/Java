package javatest;

import java.util.ArrayList;
import java.util.List;

public class ListToArrayExample {

	public static void main(String[] args) {
	List<String>stringList = new ArrayList<>();
	stringList.add("one");
	stringList.add("two");
	stringList.add("three");
	stringList.add("four");
	stringList.add("five");
	
	String[] stringArray = new String[stringList.size()];
	stringArray = stringList.toArray(stringArray);
	
	System.out.println("Array contents:");
	for (String number : stringArray) {
		System.out.println(number);
	}
	}

}

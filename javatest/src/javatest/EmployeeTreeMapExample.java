package javatest;

import java.util.TreeMap;

public class EmployeeTreeMapExample {

	public static void main(String[] args) {
		
	TreeMap<Integer, String> employeeMap = new TreeMap<>();

	employeeMap.put(2500,"Krishna");
	employeeMap.put(2501, "Gokul");
	employeeMap.put(2506, "Kannan");
	employeeMap.put(2503,"Kumar");
	
	System.out.println("Employee names in alphabetical order:");
	
	employeeMap.values().stream()
	.sorted()
	.forEach(System.out::println);

	}

}

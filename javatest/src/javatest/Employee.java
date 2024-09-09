package javatest;

public class Employee {
	
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	public Employee(int id, String firstName,String lastName,int salary) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.salary=salary;
	}
	public int getID() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getName() {
		return firstName +""+ lastName;
	}
	public int getSalary() {
		return salary;
	}
	
	public int getAnnualSalary() {
		return salary*12;
	}
	
	public int raiseSalary(int percent) {
		double raiseAmount=salary*(percent/100.0);
		salary+=(int) raiseAmount;
		return salary;
	}
	@Override
	public String toString() {
		return "Employee[id="+id+",name="+getName()+",salary="+salary+"]";
	}
	public static void main(String[]args) {
		Employee emp= new Employee(1,"Kumar","Krishna",25000);
		
		System.out.println(emp);
		
		System.out.println("Annual Salary:"+emp.getAnnualSalary());
		
		emp.raiseSalary(10);
		System.out.println("New Salary after10% raise:"+emp.getSalary());
		
		System.out.println(emp);
	}
	
		
		
		
	}



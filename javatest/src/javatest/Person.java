package javatest;

public class Person {
String name;
int age;
Person(String name,int age){
	this.name=name;
	this.age=age;
}
public String getName() {
	return name;
}
public void setName(String name)
{
	this.name=name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age=age;
}
public static void main(String[]args) {
	Person p=new Person("Kumar",25);
	System.out.println(p.getName());
	p.setName("krishna");
	System.out.println(p.getName());
	System.out.println(p.getAge());
}
}



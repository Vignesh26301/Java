package javatest;

public class Circle {
	private double radius;
	
	public Circle() {
		this.radius=1.0;
	}
public Circle(double radius) {
	this.radius=radius;
}

public double getCircumference() {
	return 2 * Math.PI*radius;
}
public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius=radius;
}
public static void main(String[]args) {
	Circle defaultCircle=new Circle();
	System.out.println("Default Circle radius:"+ defaultCircle.getCircumference());
	System.out.println("Default Circle circumference:"+ defaultCircle.getCircumference());
	
	Circle customCircle=new Circle(5.0);
	System.out.println("Custom Circle radius:"+ customCircle.getRadius());
	System.out.println("Custom Circle circumfernce:"+ customCircle.getCircumference());
		
					
				
	}

}

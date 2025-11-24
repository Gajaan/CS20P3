package Skillbuilders;

public class circle3 {

	private static final double PI=3.14;
	private double radius;
	
	
	public circle3() {
		radius=1;
	}
	
	public void setRadius(double newRadius) {
		radius=newRadius;
	}
	
	public double area() {
		double circlearea;
		
		circlearea=PI*radius*radius;
		return(circlearea);
	}
	
	public double circumference() {
		double circlecircumference;
		
		circlecircumference = PI*radius*2;
		return(circlecircumference);
	}
public double getRadius() {
	return(radius);
}

public static void displayCircumferenceFormula() {
	System.out.println("The formula for the circumference of a circle is c=2*PI*r");
}
}

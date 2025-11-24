package Skillbuilders;

public class circle {

	private static final double PI=3.14;
	private double radius;
	
	
	public circle() {
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
}


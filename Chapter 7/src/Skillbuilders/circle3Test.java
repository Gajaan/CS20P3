package Skillbuilders;

public class circle3Test {

	public static void main(String[] args) {
		circle3 spot = new circle3();
		
		spot.setRadius(3);
		System.out.println("Circle radius: " + spot.getRadius());
		System.out.println("Circle circumference: " +spot.circumference());
		circle3.displayCircumferenceFormula();

	}

}


package Skillbuilders;

public class circleTest {

	public static void main(String[] args) {
		circle spot = new circle();
		
		spot.setRadius(3);
		System.out.println("Circle radius: " + spot.getRadius());
		System.out.println("Circle circumference: " +spot.circumference());
		

	}

}

package Skillbuilders;

public class rectanglepart2 {

    private double length;
    private double width;

    public rectanglepart2() {
        length = 1;
        width = 1;
    }

    public rectanglepart2(double l, double w) {
        length = l;
        width = w;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    
    public static void displayAreaFormula() {
    	System.out.println("The formula for the area of a rectangle is: length*width");
    }
}

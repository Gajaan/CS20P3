package Skillbuilders;

public class rectanglepartone {

    private double length;
    private double width;

    public rectanglepartone() {
        length = 1;
        width = 1;
    }

    public rectanglepartone(double l, double w) {
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
}

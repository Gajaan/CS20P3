package Skillbuilders;

public class rectanglepart3 {

    private double length;
    private double width;

    public rectanglepart3() {
        length = 1;
        width = 1;
    }

    public rectanglepart3(double l, double w) {
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

    
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else {
            if (obj instanceof rectanglepart3) {
                rectanglepart3 other = (rectanglepart3) obj;
                if (this.length == other.length && this.width == other.width) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    
    public String toString() {
        return "Rectangle length: " + length + ", width: " + width + ", area: " + area() + ", perimeter: " + perimeter();
    }
}

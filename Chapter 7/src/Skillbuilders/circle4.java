package Skillbuilders;

public class circle4 {

    private static final double PI = 3.14;
    private double radius;

    public circle4() {
        radius = 1;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public double area() {
        double circlearea = PI * radius * radius;
        return circlearea;
    }

    public double circumference() {
        double circlecircumference = PI * radius * 2;
        return circlecircumference;
    }

    public double getRadius() {
        return radius;
    }

    
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else {
            if (obj instanceof circle4) {
                circle4 other = (circle4) obj;
                if (this.radius == other.radius) {
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
        return "Circle radius: " + radius + ", area: " + area() + ", circumference: " + circumference();
    }
}


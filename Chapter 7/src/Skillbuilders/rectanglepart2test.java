package Skillbuilders;

public class rectanglepart2test {

    public static void main(String[] args) {

        rectanglepart2 r3 = new rectanglepart2();
        rectanglepart2 r4 = new rectanglepart2(5, 3);

        System.out.println("r1 length: " + r3.getLength());
        System.out.println("r1 width: " + r3.getWidth());
        System.out.println("r1 area: " + r3.area());
        System.out.println("r1 perimeter: " + r3.perimeter());

        System.out.println("r2 length: " + r4.getLength());
        System.out.println("r2 width: " + r4.getWidth());
        System.out.println("r2 area: " + r4.area());
        System.out.println("r2 perimeter: " + r4.perimeter());
        rectanglepart2.displayAreaFormula();
    }
}

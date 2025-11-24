package Skillbuilders;

public class rectanglepartonetest {

    public static void main(String[] args) {

        rectanglepartone r1 = new rectanglepartone();
        rectanglepartone r2 = new rectanglepartone(5, 3);

        System.out.println("r1 length: " + r1.getLength());
        System.out.println("r1 width: " + r1.getWidth());
        System.out.println("r1 area: " + r1.area());
        System.out.println("r1 perimeter: " + r1.perimeter());

        System.out.println("r2 length: " + r2.getLength());
        System.out.println("r2 width: " + r2.getWidth());
        System.out.println("r2 area: " + r2.area());
        System.out.println("r2 perimeter: " + r2.perimeter());
    }
}

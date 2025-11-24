package Skillbuilders;

public class rectanglepart3test {

    public static void main(String[] args) {

        rectanglepart3 r1 = new rectanglepart3();
        rectanglepart3 r2 = new rectanglepart3();
        rectanglepart3 r3 = new rectanglepart3(5, 3);
        rectanglepart3 r4 = new rectanglepart3(5, 3);

        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r3.toString());
        System.out.println(r4.toString());

        System.out.println(r1.equals(r2));
        System.out.println(r3.equals(r4));
        System.out.println(r1.equals(r3));
    }
}

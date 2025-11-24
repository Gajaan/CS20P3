package Skillbuilders;

public class circle4test {

    public static void main(String[] args) {

        circle4 c1 = new circle4();
        circle4 c2 = new circle4();
        circle4 c3 = new circle4();

        c1.setRadius(5);
        c2.setRadius(5);
        c3.setRadius(3);

        System.out.println("c1: " + c1.toString());
        System.out.println("c2: " + c2.toString());
        System.out.println("c3: " + c3.toString());

        System.out.println("c1 equals c2: " + c1.equals(c2));
        System.out.println("c1 equals c3: " + c1.equals(c3));

        System.out.println("c1 radius: " + c1.getRadius());
        System.out.println("c1 area: " + c1.area());
        System.out.println("c1 circumference: " + c1.circumference());
    }
}
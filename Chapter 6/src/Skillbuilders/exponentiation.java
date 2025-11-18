package Skillbuilders;

import java.util.Scanner;

public class exponentiation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the base number:");
        int base = input.nextInt();

        System.out.println("Enter the exponent:");
        int exp = input.nextInt();

        System.out.println(powerOf(base, exp));
    }

    public static int powerOf(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }
}
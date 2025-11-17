/*
Program: PrimeNumberscontinued.java          
Last Date of this Revision: November 6 2025

Purpose: create the application to prompt the user for two numbers and then display the prime numbers between those numbers
Author: Gajaan Ram
School: CHHS
Course: Computer Science 20
*/

package mastery;

import java.util.Scanner;

public class PrimeNumberscontinued {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // creates a Scanner for user input

        System.out.println("Enter the first number:"); // asks for first number
        int start = input.nextInt(); // stores first number

        System.out.println("Enter the second number:"); // asks for second number
        int end = input.nextInt(); // stores second number

        System.out.println("Prime numbers between " + start + " and " + end + ":"); // prints message showing range

        int num = start; // start checking from the first number

        while (num <= end) { // loop through all numbers in the range
            int divisor = 2; // start checking from 2
            int count = 0; // keeps track of how many divisors found

            while (divisor < num) { // check possible divisors smaller than the number
                if (num % divisor == 0) { // if number divides evenly
                    count = count + 1; // increase count
                }
                divisor++; // move to next divisor
            }

            if (count == 0 && num > 1) { // if no divisors found and greater than 1
                System.out.println(num); // print as prime
            }

            num++; // move to next number
        }
    }
}

/* Screen Dump
Enter the first number:
1
Enter the second number:
15
Prime numbers between 1 and 15:
2
3
5
7
11
13


 */

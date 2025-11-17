/*
Program: PrimeNumberscontinued.java          
Last Date of this Revision: November 17 2025

Purpose: create a PrimeNumber application that prompts the user for a number and then displays a message indicating whether the number is prime or not
Author: Gajaan Ram
School: CHHS
Course: Computer Science 20
*/
package mastery;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {        // Program starts here
        Scanner input = new Scanner(System.in);     // Creates a Scanner for user input
        
        System.out.println("choose a number");      // Asks the user to enter a number
        int num = input.nextInt();                  // Stores the user’s number in 'num'
        
        if (num % 2 == 0 && num != 2) {       // Checks if the number is even AND not 2 → composite
            System.out.println("The number is composite.");
        }

        if (num % 2 != 0 || num == 2) {       // Checks if the number is odd OR equal to 2 → prime
            System.out.println("The number is prime.");
        }
    }
}
/* Screen Dump
If the number is a prime number

choose a number
71
The number is prime.

If the number is an even number

choose a number
64
The number is composite.



 */
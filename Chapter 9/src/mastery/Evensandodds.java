/*
Program: Evensandodds.java          
Last Date of this Revision: December 16 2025

Purpose: create a randomStats application that generates 500 random numbers between 0 and 9 and then displays the number of occurrences of each number.
Author: Gajaan Ram
School: CHHS
Course: Computer Science 20
*/
package mastery;

public class Evensandodds {

    public static void main(String[] args) {

        int[] counts = new int[100];               // Creates an array to count numbers from 0 to 99

        for (int i = 0; i < 25; i++) {              // Loop that runs 25 times
            int num = (int)(Math.random() * 100);   // Generates a random number between 0 and 99
            counts[num]++;                          // Increases the count for that number
        }

        System.out.print("Odds: ");                 // Prints the label for odd numbers
        for (int i = 0; i < counts.length; i++) {  // Loops through all possible numbers
            if (i % 2 != 0 && counts[i] > 0) {      // Checks if the number is odd and occurred at least once
                for (int o = 0; o < counts[i]; o++) { // Loops as many times as the number occurred
                    System.out.print(i + " ");      // Prints the odd number
                }
            }
        }

        System.out.println();                       // Moves to a new line

        System.out.print("Evens: ");                // Prints the label for even numbers
        for (int i = 0; i < counts.length; i++) {  // Loops through all possible numbers
            if (i % 2 == 0 && counts[i] > 0) {      // Checks if the number is even and occurred at least once
                for (int e = 0; e < counts[i]; e++) { // Loops as many times as the number occurred
                    System.out.print(i + " ");      // Prints the even number
                }
            }
        }
    }
}

/*
Odds: 9 15 21 23 29 39 43 47 61 67 75 75 79 79 79 81 
Evens: 20 30 32 48 48 52 70 84 96 
 */

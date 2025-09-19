/*
Program: changeCounter.java          
Last Date of this Revision: September 18, 2025

Purpose: Create a change application that prompts the user for an amount less than $1.00 and then displays the minimum number of coins necessary to make the change. The change can be made up of quarters, dimes, nickels and pennies.

Author: Gajaan Ram
School: CHHS
Course: Computer Science 20
*/
package mastery;

import java.util.Scanner;

public class changeCounter {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);  // Create a Scanner object to read input from the user
        
        System.out.println("enter the amount of change you have in cents ");  // Prompt the user for input
        int amount = input.nextInt();  // Read the user input as an integer and store it in 'amount'
        
        int quarters = amount / 25;  // Calculate number of quarters by dividing amount by 25
        int remainder = amount % 25;  // Find remainder after quarters
        
        int dimes = remainder / 10;  // Calculate number of dimes from the remainder
        remainder = remainder % 10;  // Update remainder after extracting dimes
        
        int nickels = remainder / 5;  // Calculate number of nickels from the remainder
        remainder = remainder % 5;  // Update remainder after extracting nickels
        
        int pennies = remainder;  // Remaining cents are pennies
        
        // Display the number of each coin type
        System.out.println("your amount of quarters: " + quarters);
        System.out.println("your amount of dimes: " + dimes);
        System.out.println("your amount of nickels: " + nickels);
        System.out.println("your amount of pennies: " + pennies);
    }
}

/* Screen Dump

enter the amount of change you have in cents 
567
your amount of quarters: 22
your amount of dimes: 1
your amount of nickels: 1
your amount of pennies: 2


*/
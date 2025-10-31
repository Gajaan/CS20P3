/*
Program: printingApplication.java          
Last Date of this Revision: October 31, 2025

Purpose: Create a printing application that prompts the user for the number of copites to print and then displays the price per copy and the total price for the job.
Author: Gajaan Ram
School: CHHS
Course: Computer Science 20
*/
package mastery;
import java.util.Scanner;

public class printingApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   // Create a Scanner object to read user input

        System.out.println("How many copies do you want to print? ");  // Ask the user how many copies they want
        int copies = input.nextInt();   // Store the user's input as an integer called copies

        double pricePerCopy;   // Variable that will hold the price per copy

        // Decide the price per copy based on how many copies are printed
        if (copies < 99) 
            pricePerCopy = 0.30;        // $0.30 per copy if less than 99 copies
        else if (copies < 499) 
            pricePerCopy = 0.28;        // $0.28 per copy if less than 499 copies
        else if (copies < 749) 
            pricePerCopy = 0.27;        // $0.27 per copy if less than 749 copies
        else if (copies < 1000) 
            pricePerCopy = 0.26;        // $0.26 per copy if less than 1000 copies
        else 
            pricePerCopy = 0.25;        // $0.25 per copy if 1000 or more copies

        double totalPrice = Math.round(copies * pricePerCopy);   // Multiply copies by price and round to the nearest whole number

        System.out.println("It will be $" + pricePerCopy + " per copy.");  // Display the cost per copy
        System.out.println("The total price will be $" + totalPrice);      // Display the total cost
    }

    }

/* Screen Dump
 When there is less than 99 copies and it costs $0.30
 
 How many copies do you want to print? 
64
It will be $0.3 per copy.
The total price will be $19.0

When there is less than 499 copies and it costs $0.28

How many copies do you want to print? 
342
It will be $0.28 per copy.
The total price will be $96.0

When there is less than 749 copies and it costs $0.27

How many copies do you want to print? 
634
It will be $0.27 per copy.
The total price will be $171.0

When there is less than 1000 copies and it costs $0.26

How many copies do you want to print? 
989
It will be $0.26 per copy.
The total price will be $257.0

when there is more than 1000 copies and it costs $0.25

How many copies do you want to print? 
3423
It will be $0.25 per copy.
The total price will be $856.0
 
*/

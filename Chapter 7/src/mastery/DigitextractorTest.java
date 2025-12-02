/*
Program: metricConverstion.java          
Last Date of this Revision: November 18 2025

Purpose: create a MetricConversion application that displays a menu of conversion choices and then prompts the user to choose a conversion. Conversion choices should include inches to centimeters, feet to centimeters yards to meters miles to kilometers and vice versa
Author: Gajaan Ram
School: CHHS
Course: Computer Science 20
*/
package mastery;

import java.util.Scanner; // imports Scanner for user input

public class DigitextractorTest { // begins the tester class
    public static void main(String[] args) { // main method starts the program

        Digitextractor de = new Digitextractor(); // creates a Digitextractor object
        Scanner input = new Scanner(System.in); // creates a Scanner for input

        System.out.println("Enter a three-digit number:"); // prompts user for a number
        int num = input.nextInt(); // reads the integer input
        de.pickaninteger(num); // sets the number in the Digitextractor object

        boolean running = true; // controls the while loop

        while (running) { // loop continues until user quits
            System.out.println("\nEnter a letter:"); // prompts user for a choice
            System.out.println("(w) = whole number"); // option for whole number
            System.out.println("(h) = hundreds place"); // option for hundreds place
            System.out.println("(t) = tens place"); // option for tens place
            System.out.println("(o) = ones place"); // option for ones place
            System.out.println("(q) = quit"); // option to quit

            String choice = input.next(); // reads user input as a string

            if (choice.equals("w")) // checks if input is "w"
                de.wholenumber(choice); // prints the whole number
            else if (choice.equals("h")) // checks if input is "h"
                de.hundredsplace(choice); // prints hundreds place
            else if (choice.equals("t")) // checks if input is "t"
                de.tensplace(choice); // prints tens place
            else if (choice.equals("o")) // checks if input is "o"
                de.onesplace(choice); // prints ones place
            else if (choice.equals("q")) // checks if input is "q"
                running = false; // stops the loop
            else // if none of the above
                System.out.println("Invalid letter"); // prints invalid message
        }
    }
}
/*
 
 If the user inputs a three digit number and wants a whole number
 Enter a three-digit number:
672

Enter a letter:
(w) = whole number
(h) = hundreds place
(t) = tens place
(o) = ones place
(q) = quit
w
Whole number: 672

Enter a letter:
(w) = whole number
(h) = hundreds place
(t) = tens place
(o) = ones place
(q) = quit
q

If the user inputs a three digit number and wants the number in the hundreds place


Enter a three-digit number:
672

Enter a letter:
(w) = whole number
(h) = hundreds place
(t) = tens place
(o) = ones place
(q) = quit
h
Hundreds place: 6

Enter a letter:
(w) = whole number
(h) = hundreds place
(t) = tens place
(o) = ones place
(q) = quit
q

If the user inputs a three digit number and wants the number in the tens place

Enter a three-digit number:
672

Enter a letter:
(w) = whole number
(h) = hundreds place
(t) = tens place
(o) = ones place
(q) = quit
t
Tens place: 7

Enter a letter:
(w) = whole number
(h) = hundreds place
(t) = tens place
(o) = ones place
(q) = quit
q


If the user inputs a three digit number and wants the number in the ones place

Enter a three-digit number:
672

Enter a letter:
(w) = whole number
(h) = hundreds place
(t) = tens place
(o) = ones place
(q) = quit
o
Ones place: 2

Enter a letter:
(w) = whole number
(h) = hundreds place
(t) = tens place
(o) = ones place
(q) = quit


If the user wants to end the program without choosing what place value they want  

Enter a three-digit number:
672

Enter a letter:
(w) = whole number
(h) = hundreds place
(t) = tens place
(o) = ones place
(q) = quit
q

 */

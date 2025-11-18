/*
Program: metricConverstion.java          
Last Date of this Revision: November 18 2025

Purpose: create a MetricConversion application that displays a menu of conversion choices and then prompts the user to choose a conversion. Conversion choices should include inches to centimeters, feet to centimeters yards to meters miles to kilometers and vice versa
Author: Gajaan Ram
School: CHHS
Course: Computer Science 20
*/


package mastery;

import java.util.Scanner; // Imports the Scanner class for user input

public class metricConverstion { // Defines the class named metricConverstion

    public static void inchestocentimeters() { // Method to convert inches to centimeters
        double inches, centimeters; // Variables to store inches and centimeters
        Scanner input = new Scanner(System.in); // Create Scanner for user input
        System.out.println("enter your measurement in inches"); // Prompt user to enter inches
        double measurement = input.nextDouble(); // Read user input as double

        centimeters = measurement * 2.54; // Convert inches to centimeters

        System.out.println("your measurement in centimeters is " + centimeters); // Print result
        input.close(); // Close Scanner
    }

    public static void centimetersToInches() { // Method to convert centimeters to inches
        double inches2, centimeters2; // Variables to store inches and centimeters
        Scanner input = new Scanner(System.in); // Create Scanner
        System.out.println("enter your measurement in centimeters"); // Prompt user
        double measurement = input.nextDouble(); // Read input

        inches2 = measurement / 2.54; // Convert centimeters to inches

        System.out.println("your measurement in inches is " + inches2); // Print result
        input.close(); // Close Scanner
    }

    public static void feettocentimeters() { // Method to convert feet to centimeters
        double feet, centimeters3; // Variables
        Scanner input = new Scanner(System.in); // Create Scanner

        System.out.println("enter your measurement in feet "); // Prompt user
        double measurement = input.nextDouble(); // Read input

        centimeters3 = measurement * 30; // Convert feet to centimeters (approximate)

        System.out.println("your measurement in centimeters is " + centimeters3); // Print result
        input.close(); // Close Scanner
    }

    public static void centimeterstofeet() { // Method to convert centimeters to feet
        double feet2, centimeters4; // Variables
        Scanner input = new Scanner(System.in); // Create Scanner

        System.out.println("enter your measurement in centimeters "); // Prompt user
        double measurement = input.nextDouble(); // Read input

        feet2 = measurement / 30; // Convert centimeters to feet (approximate)

        System.out.println("your measurement in feet is " + feet2); // Print result
        input.close(); // Close Scanner
    }

    public static void yardstometers() { // Method to convert yards to meters
        double yards, meters; // Variables
        Scanner input = new Scanner(System.in); // Create Scanner

        System.out.println("enter your measurement in yards "); // Prompt user
        double measurement = input.nextDouble(); // Read input

        meters = measurement * 0.91; // Convert yards to meters (approximate)

        System.out.println("your measurement in meters is " + meters); // Print result
        input.close(); // Close Scanner
    }

    public static void meterstoyards() { // Method to convert meters to yards
        double yard2s, meters2; // Variables
        Scanner input = new Scanner(System.in); // Create Scanner

        System.out.println("enter your measurement in meters "); // Prompt user
        double measurement = input.nextDouble(); // Read input

        yard2s = measurement / 0.91; // Convert meters to yards (approximate)

        System.out.println("your measurement in yards is " + yard2s); // Print result
        input.close(); // Close Scanner
    }

    public static void milestokilometers() { // Method to convert miles to kilometers
        double miles, kilometers; // Variables
        Scanner input = new Scanner(System.in); // Create Scanner

        System.out.println("enter your measurement in miles "); // Prompt user
        double measurement = input.nextDouble(); // Read input

        kilometers = measurement * 1.6; // Convert miles to kilometers (approximate)

        System.out.println("your measurement in kilometers is " + kilometers); // Print result
        input.close(); // Close Scanner
    }

    public static void kilometerstomiles() { // Method to convert kilometers to miles
        double miles2, kilometer2s; // Variables
        Scanner input = new Scanner(System.in); // Create Scanner

        System.out.println("enter your measurement in kilometers "); // Prompt user
        double measurement = input.nextDouble(); // Read input

        miles2 = measurement / 1.6; // Convert kilometers to miles (approximate)

        System.out.println("your measurement in miles is " + miles2); // Print result
        input.close(); // Close Scanner
    }

    public static void main(String[] args) { // Main method, program starts here
        int choice; // Variable to store user's menu choice
        Scanner input = new Scanner(System.in); // Create Scanner for user input

        // Print menu options
        System.out.println("which conversion would you like to do: ");
        System.out.println("1. inches to centimeters");
        System.out.println("2. centimeters to inches");
        System.out.println("3. feet to centimeters");
        System.out.println("4. centimeters to feet");
        System.out.println("5. yards to meters ");
        System.out.println("6. meters to yards");
        System.out.println("7. miles to kilometers");
        System.out.println("8. kilometers to miles");
        choice = input.nextInt(); // Read user choice

        // Call the method based on user's choice
        if (choice == 1) {
            inchestocentimeters();
        }

        if (choice == 2) {
            centimetersToInches();
        }

        if (choice == 3) {
            feettocentimeters();
        }

        if (choice == 4) {
            centimeterstofeet();
        }

        if (choice == 5) {
            yardstometers();
        }

        if (choice == 6) {
            meterstoyards();
        }

        if (choice == 7) {
            milestokilometers();
        }

        if (choice == 8) {
            kilometerstomiles();
        }
    }
}

/* Screen Dump
if the user picks choice 1

which conversion would you like to do: 
1. inches to centimeters
2. centimeters to inches
3. feet to centimeters
4. centimeters to feet
5. yards to meters 
6. meters to yards
7. miles to kilometers
8. kilometers to miles
1
enter your measurement in inches
56
your measurement in centimeters is 142.24

if the user picks choice 2

which conversion would you like to do: 
1. inches to centimeters
2. centimeters to inches
3. feet to centimeters
4. centimeters to feet
5. yards to meters 
6. meters to yards
7. miles to kilometers
8. kilometers to miles
2
enter your measurement in centimeters
76
your measurement in inches is 29.921259842519685

if the user picks choice 3

which conversion would you like to do: 
1. inches to centimeters
2. centimeters to inches
3. feet to centimeters
4. centimeters to feet
5. yards to meters 
6. meters to yards
7. miles to kilometers
8. kilometers to miles
3
enter your measurement in feet 
43
your measurement in centimeters is 1290.0


if the user picks choice 4

which conversion would you like to do: 
1. inches to centimeters
2. centimeters to inches
3. feet to centimeters
4. centimeters to feet
5. yards to meters 
6. meters to yards
7. miles to kilometers
8. kilometers to miles
4
enter your measurement in centimeters 
54
your measurement in feet is 1.8

if the user picks choice 5

which conversion would you like to do: 
1. inches to centimeters
2. centimeters to inches
3. feet to centimeters
4. centimeters to feet
5. yards to meters 
6. meters to yards
7. miles to kilometers
8. kilometers to miles
5
enter your measurement in yards 
87
your measurement in meters is 79.17

if the user picks choice 6

which conversion would you like to do: 
1. inches to centimeters
2. centimeters to inches
3. feet to centimeters
4. centimeters to feet
5. yards to meters 
6. meters to yards
7. miles to kilometers
8. kilometers to miles
6
enter your measurement in meters 
34
your measurement in yards is 37.362637362637365

if the user picks choice 7

which conversion would you like to do: 
1. inches to centimeters
2. centimeters to inches
3. feet to centimeters
4. centimeters to feet
5. yards to meters 
6. meters to yards
7. miles to kilometers
8. kilometers to miles
7
enter your measurement in miles 
5
your measurement in kilometers is 8.0

if the user picks choice 8

which conversion would you like to do: 
1. inches to centimeters
2. centimeters to inches
3. feet to centimeters
4. centimeters to feet
5. yards to meters 
6. meters to yards
7. miles to kilometers
8. kilometers to miles
8
enter your measurement in kilometers 
1.6
your measurement in miles is 1.0


 */


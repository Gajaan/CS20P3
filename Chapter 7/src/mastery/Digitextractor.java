/*
Program: metricConverstion.java          
Last Date of this Revision: November 18 2025

Purpose: create a MetricConversion application that displays a menu of conversion choices and then prompts the user to choose a conversion. Conversion choices should include inches to centimeters, feet to centimeters yards to meters miles to kilometers and vice versa
Author: Gajaan Ram
School: CHHS
Course: Computer Science 20
*/
package mastery;

public class Digitextractor { // begins the Digitextractor class
    private int number; // stores the integer to extract digits from

    public void pickaninteger(int n) { // method to set the number
        number = n; // assigns the passed integer to the number variable
    }

    public void wholenumber(String letter) { // prints the whole number if "w" is entered
        if (letter.equals("w")) // checks if the input is "w"
            System.out.println("Whole number: " + number); // prints the whole number
    }

    public void hundredsplace(String letter) { // prints the hundreds digit if "h" is entered
        if (letter.equals("h")) // checks if input is "h"
            System.out.println("Hundreds place: " + (number / 100)); // calculates and prints hundreds place
    }

    public void tensplace(String letter) { // prints the tens digit if "t" is entered
        if (letter.equals("t")) // checks if input is "t"
            System.out.println("Tens place: " + ((number / 10) % 10)); // calculates and prints tens place
    }

    public void onesplace(String letter) { // prints the ones digit if "o" is entered
        if (letter.equals("o")) // checks if input is "o"
            System.out.println("Ones place: " + (number % 10)); // calculates and prints ones place
    }
}


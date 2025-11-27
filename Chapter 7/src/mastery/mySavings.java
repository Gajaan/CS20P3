/*
Program: mySavings.java          
Last Date of this Revision: November 26 2025

Purpose: Create a MySavings application that displays a menu of choices for entering pennies, nickels, dimes, and quarters into a piggybank and then prompts the user to make a selection. The Mysavings application should include a piggybank object that can add coins to the piggy bank remove coins and return the total amount in the bank.
Author: Gajaan Ram
School: CHHS
Course: Computer Science 20
*/
package mastery;

import java.util.Scanner; // Imports Scanner so you can read user input

public class mySavings { // Starts the mySavings class

    private double totalbank = 15.00; // Stores the total amount of money in the bank
    private double penny = 0.01; // Value of one penny
    private double nickel = 0.05; // Value of one nickel
    private double dime = 0.10; // Value of one dime
    private double quarter = 0.25; // Value of one quarter

    public void showTotalInBank() { // Method to display the total money
        System.out.println("You have a total of $" + totalbank); // Prints the total amount
    }

    public void setNewTotalBank(double amount) { // Method to reset the bank amount
        totalbank = amount; // Sets totalbank to the new amount
    }

    public void addPennies() { // Method to add pennies
        Scanner input = new Scanner(System.in); // Creates a Scanner to read user input
        System.out.println("How many pennies do you want to add? "); // Asks user for number of pennies
        int count = input.nextInt(); // Reads number of pennies
        totalbank += count * penny; // Adds value of pennies to total
    }

    public double getTotalBank() { // Method to return total amount of money
        return totalbank; // Returns totalbank
    }
    
    public void addnickels() { // Method to add nickels
        Scanner input = new Scanner(System.in); // Reads user input
        System.out.println("How many nickels do you want to add? "); // Asks user for number of nickels
        int count1 = input.nextInt(); // Reads number of nickels
        totalbank += count1 * nickel; // Adds value of nickels to total
    }
     
    public void adddimes() { // Method to add dimes
        Scanner input = new Scanner(System.in); // Reads user input
        System.out.println("How many dimes do you want to add? "); // Asks user for number of dimes
        int count2 = input.nextInt(); // Reads number of dimes
        totalbank += count2 * dime; // Adds value of dimes to total
    }
    
    public void addquarters() { // Method to add quarters
        Scanner input = new Scanner(System.in); // Reads user input
        System.out.println("How many quarter do you want to add"); // Asks user for number of quarters
        int count3 = input.nextInt(); // Reads number of quarters
        totalbank += count3 * quarter; // Adds value of quarters to total
    }

    public void removecoins() { // Method to withdraw money
        Scanner input = new Scanner(System.in); // Reads user input
        System.out.println("How much money do you wish to withdraw? "); // Asks user for amount to remove
        double remove = input.nextDouble(); // Reads amount to remove
        totalbank -= remove; // Subtracts that amount from the total
    }
}

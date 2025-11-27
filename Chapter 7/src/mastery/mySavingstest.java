package mastery;

import java.util.Scanner; // Allows the program to read user input

public class mySavingstest { // Starts the tester class
    public static void main(String[] args) { // Main method that runs the program

        mySavings spot = new mySavings(); // Creates a mySavings object to access savings methods
        Scanner input = new Scanner(System.in); // Scanner for menu input

        boolean bank = false; // Controls the loop; false means the menu keeps running

        while (!bank) { // Loop continues until the user chooses to exit
            System.out.println("1. Show total"); // Menu option 1
            System.out.println("2. Add pennies"); // Menu option 2
            System.out.println("3. Add nickels"); // Menu option 3
            System.out.println("4. Add dimes"); // Menu option 4
            System.out.println("5. Add quarters"); // Menu option 5
            System.out.println("6. Withdraw money"); // Menu option 6
            System.out.println("7. Exit the bank"); // Menu option 7
            System.out.print("Choose an option: "); // Asks user for their choice

            int choice = input.nextInt(); // Reads the menu choice as an integer
            input.nextLine(); // Clears leftover input from scanner

            if (choice == 1) { // If user chooses 1
                spot.showTotalInBank(); // Show total money
            } else if (choice == 2) { // If user chooses 2
                spot.addPennies(); // Add pennies
            } else if (choice == 3) { // If user chooses 3
                spot.addnickels(); // Add nickels
            } else if (choice == 4) { // If user chooses 4
                spot.adddimes(); // Add dimes
            } else if (choice == 5) { // If user chooses 5
                spot.addquarters(); // Add quarters
            } else if (choice == 6) { // If user chooses 6
                spot.removecoins(); // Withdraw money
            } else if (choice == 7) { // If user chooses 7
                bank = true; // Ends the loop and exits
            } else { // Any other number is invalid
                System.out.println("Invalid choice."); // Tells the user their input was invalid
            }

            System.out.println("Current total: $" + spot.getTotalBank()); // Shows updated total after each action
        }
    }
}
/* Screen Dump
 when the user wants to see the total amount in the bank before they add money into it
 
 1. Show total
2. Add pennies
3. Add nickels
4. Add dimes
5. Add quarters
6. Withdraw money
7. Exit the bank
Choose an option: 1
You have a total of $15.0
Current total: $15.0
1. Show total
2. Add pennies
3. Add nickels
4. Add dimes
5. Add quarters
6. Withdraw money
7. Exit the bank
Choose an option: 
  
 When the user wants to add money and then see the total amount
 
 1. Show total
2. Add pennies
3. Add nickels
4. Add dimes
5. Add quarters
6. Withdraw money
7. Exit the bank
Choose an option: 2
How many pennies do you want to add? 
54
Current total: $15.54
1. Show total
2. Add pennies
3. Add nickels
4. Add dimes
5. Add quarters
6. Withdraw money
7. Exit the bank
Choose an option: 1
You have a total of $15.54
Current total: $15.54
1. Show total
2. Add pennies
3. Add nickels
4. Add dimes
5. Add quarters
6. Withdraw money
7. Exit the bank
Choose an option: 

when the user wants to withdraw money and then see the total amount
1. Show total
2. Add pennies
3. Add nickels
4. Add dimes
5. Add quarters
6. Withdraw money
7. Exit the bank
Choose an option: 6
How much money do you wish to withdraw? 
0.93
Current total: $14.07
1. Show total
2. Add pennies
3. Add nickels
4. Add dimes
5. Add quarters
6. Withdraw money
7. Exit the bank
Choose an option: 1
You have a total of $14.07
Current total: $14.07
1. Show total
2. Add pennies
3. Add nickels
4. Add dimes
5. Add quarters
6. Withdraw money
7. Exit the bank
Choose an option: 

when the user wants to add money and exit the bank

1. Show total
2. Add pennies
3. Add nickels
4. Add dimes
5. Add quarters
6. Withdraw money
7. Exit the bank
Choose an option: 5
How many quarter do you want to add
89
Current total: $37.25
1. Show total
2. Add pennies
3. Add nickels
4. Add dimes
5. Add quarters
6. Withdraw money
7. Exit the bank
Choose an option: 7
Current total: $37.25

 when the user wants to withdraw money and exit the bank
 
 1. Show total
2. Add pennies
3. Add nickels
4. Add dimes
5. Add quarters
6. Withdraw money
7. Exit the bank
Choose an option: 6
How much money do you wish to withdraw? 
9
Current total: $6.0
1. Show total
2. Add pennies
3. Add nickels
4. Add dimes
5. Add quarters
6. Withdraw money
7. Exit the bank
Choose an option: 7
Current total: $6.0

when the user wants to add pennies
1. Show total
2. Add pennies
3. Add nickels
4. Add dimes
5. Add quarters
6. Withdraw money
7. Exit the bank
Choose an option: 2
How many pennies do you want to add? 
342
Current total: $18.42
1. Show total
2. Add pennies
3. Add nickels
4. Add dimes
5. Add quarters
6. Withdraw money
7. Exit the bank
Choose an option: 

when the user wants to add nickels

1. Show total
2. Add pennies
3. Add nickels
4. Add dimes
5. Add quarters
6. Withdraw money
7. Exit the bank
Choose an option: 3
How many nickels do you want to add? 
982
Current total: $64.1
1. Show total
2. Add pennies
3. Add nickels
4. Add dimes
5. Add quarters
6. Withdraw money
7. Exit the bank
Choose an option: 

when the user wants to add dimes

1. Show total
2. Add pennies
3. Add nickels
4. Add dimes
5. Add quarters
6. Withdraw money
7. Exit the bank
Choose an option: 4
How many dimes do you want to add? 
546
Current total: $69.6
1. Show total
2. Add pennies
3. Add nickels
4. Add dimes
5. Add quarters
6. Withdraw money
7. Exit the bank
Choose an option: 


when the user wants to add quarters

1. Show total
2. Add pennies
3. Add nickels
4. Add dimes
5. Add quarters
6. Withdraw money
7. Exit the bank
Choose an option: 5
How many quarter do you want to add
4353
Current total: $1103.25
1. Show total
2. Add pennies
3. Add nickels
4. Add dimes
5. Add quarters
6. Withdraw money
7. Exit the bank
Choose an option: 



 * 
 */

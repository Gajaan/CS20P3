/*
Program: deliveryService.java          
Last Date of this Revision: October 29, 2025

Purpose: Create a package check application that prompts the user for the weight of a package and its dimensions (length, width, and height), and then displays an appropriate message if the package does not meet the requirements.
Author: Gajaan Ram
School: CHHS
Course: Computer Science 20
*/
package mastery;

import java.util.Scanner;

public class deliveryService {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   // Create a Scanner to read user input

        System.out.println("Enter package weight in kilograms: ");  // Ask for the package weight
        int weight = input.nextInt();   // Store the weight entered by the user

        System.out.println("Enter package length in centimeters: ");  // Ask for the package length
        int length = input.nextInt();   // Store the length entered by the user

        System.out.println("Enter package width in centimeters: ");  // Ask for the package width
        int width = input.nextInt();    // Store the width entered by the user

        System.out.println("Enter package height in centimeters: ");  // Ask for the package height
        int height = input.nextInt();   // Store the height entered by the user

        // If the weight is over 27 kg and the size is under 100,000 cubic cm
        if (weight > 27)
        if (length * width * height < 100000)
            System.out.println("Package is too heavy");  // Print that the package is too heavy

        // If the weight is 27 kg or less but the size is over 100,000 cubic cm
        if (weight < 27)
        if (length * width * height > 100000)
            System.out.println("Package is too big");  // Print that the package is too big

        // If the package is both over 27 kg and over 100,000 cubic cm
        if (weight > 27)
        if (length * width * height > 100000)
            System.out.println("Package is too big and too heavy");  // Print that it’s both too heavy and too big

        // If the package is 27 kg or less and under 100,000 cubic cm
        if (weight < 27)
        if (length * width * height < 100000)
            System.out.println("Your package fits the requirements and is ready to be sent to ship");  // Print that the package is okay to ship
    }
}

/* Screen Dump
If the weight is over 27kg but the volume is less than 100 000 cubic cm:

Enter package weight in kilograms: 
32
Enter package length in centimeters: 
16
Enter package width in centimeters: 
17
Enter package height in centimeters: 
18
Package is too heavy


If the weight is less than 27kg but the volume is over 100 000 cubic cm:

Enter package weight in kilograms: 
12
Enter package length in centimeters: 
100
Enter package width in centimeters: 
100
Enter package height in centimeters: 
100
Package is too big



If the weight and volume is over 27kg and 100 000 cubic cm:

Enter package weight in kilograms: 
54
Enter package length in centimeters: 
100
Enter package width in centimeters: 
199
Enter package height in centimeters: 
199
Package is too big and too heavy


If the weight and volume is under 27kg and 100 000 cubic cm:

Enter package weight in kilograms: 
23
Enter package length in centimeters: 
10
Enter package width in centimeters: 
9
Enter package height in centimeters: 
24
Your package fits the requirements and is ready to be sent to ship
*/
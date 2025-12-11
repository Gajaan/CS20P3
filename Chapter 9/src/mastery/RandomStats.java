/*
Program: RandomStats.java          
Last Date of this Revision: November 11 2025

Purpose: create a random 
Author: Gajaan Ram
School: CHHS
Course: Computer Science 20
*/
package mastery;

public class RandomStats {

    public static void main(String[] args) {
        
        int[] counts = new int[10];                // Creates an array to count numbers 0–9

        for (int i = 0; i < 500; i++) {            // Loop that repeats 500 times
            int num = (int)(Math.random() * 10);   // Generates a random number from 0 to 9
            counts[num]++;                         // Adds 1 to the counter for that number
        }
        
        System.out.println("num:   outcomes:   ");

        for (int i = 0; i < 10; i++) {             // Goes through each number 0–9
            System.out.println(i + "  :     " + counts[i]); // Prints the number and how many times it occurred
        }
    }
}

/*
num:   outcomes:   
0  :     52
1  :     50
2  :     58
3  :     32
4  :     41
5  :     45
6  :     52
7  :     53
8  :     60
9  :     57


 */
 
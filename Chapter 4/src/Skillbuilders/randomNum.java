package Skillbuilders;

import java.util.Scanner;
import java.util.Random;

public class randomNum {

	 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        Random rand = new Random();
	        
	        System.out.print("Enter the minimum value: ");
	        int min = input.nextInt();
	        
	        System.out.print("Enter the maximum value: ");
	        int max = input.nextInt();
	        
	        int randomNumber = rand.nextInt(max - min + 1) + min;

	        System.out.println("Random number between " + min + " and " + max + ": " + randomNumber);
	
	
	
}
}
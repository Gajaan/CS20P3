package Skillbuilders;

import java.util.Scanner;

public class perfectSquare {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("please enter your number that you think is a perfect square ");
		double perfectsquare = input.nextInt();
		
		 double squareRoot = Math.sqrt(perfectsquare);
		 
		 int wholeNumber = (int) squareRoot;

	     
	        int squared = wholeNumber * wholeNumber;

	        
	        if (squared == perfectsquare) 
	            System.out.println(perfectsquare + " is a perfect square.");
	         else 
	            System.out.println(perfectsquare + " is not a perfect square.");
	         		
		
}	      
}

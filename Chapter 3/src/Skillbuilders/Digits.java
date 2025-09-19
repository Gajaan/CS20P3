package Skillbuilders;

import java.util.Scanner;

public class Digits{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a 2 digit number ");
	
	int num = input.nextInt();
	
	int tens = num / 10;
	
	int ones = num %10;
	
	System.out.println("the tens place of your number is " +tens);
	System.out.println("the ones place of your number is " +ones);
		 
		
	}
}

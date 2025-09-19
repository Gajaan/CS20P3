package Skillbuilders;

import java.util.Scanner;

public class GradeAvg {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter your first grade ");
		int num = input.nextInt();
		
		System.out.println("enter your fourth grade ");
		int num2 = input.nextInt();
		
		System.out.println("enter your second grade ");
		int num3 = input.nextInt();
		
		System.out.println("enter your third grade ");
		int num4 = input.nextInt();
		
		System.out.println("enter your fifth grade ");
		int num5 = input.nextInt();
		
		double average =(double)(num+num2+num3+num4+num5)/5;
		
		System.out.println("your total grade average is " +average);
}
}

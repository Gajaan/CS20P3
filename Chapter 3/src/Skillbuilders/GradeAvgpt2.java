package Skillbuilders;

import java.util.Scanner;

public class GradeAvgpt2 {
	public static void main(String[] args) {
		
		int sum = 0;
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter your first grade ");
		sum += input.nextInt();
		
		System.out.println("enter your fourth grade ");
		sum += input.nextInt();
		
		System.out.println("enter your second grade ");
		sum += input.nextInt();
		
		System.out.println("enter your third grade ");
		sum += input.nextInt();
		
		System.out.println("enter your fifth grade ");
		sum += input.nextInt();
		
		double average =(double)(sum)/5;
		
		System.out.printf("your total grade average is %.2f%%%n", +average);
}
}

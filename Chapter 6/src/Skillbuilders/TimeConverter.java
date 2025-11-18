package Skillbuilders;

import java.util.Scanner;

public class TimeConverter {


	public static void hourstominutes() { 
		
		double hours, minutes;
		Scanner input = new Scanner(System.in);
		
	System.out.println("enter your time in hours ");
	hours = input.nextDouble();
	input.close();
	
	minutes= 60*hours;
	
	System.out.println("the time in minutes " +minutes);
	
	
	}
	


public static void minutestohours() {
	
	double hours2, minutes2;
	
Scanner input = new Scanner(System.in);

System.out.println("enter your time in minutes ");
minutes2 = input.nextDouble();
input.close();
	
hours2 = minutes2/60;

System.out.println("the time in hours is " +hours2);
	
	}


public static void daystohours() {

	double days, hours3;
	Scanner input = new Scanner(System.in);
	
	System.out.println("enter your time in days ");
	days=input.nextDouble();
	input.close();
	hours3= 24*days;
	
	System.out.println("your time in hours is " +hours3);
	
	
	
	
}
	

public static void hourstodays() {
	double hours4, days2;
	
	Scanner input= new Scanner(System.in);
	
	System.out.println("enter your time in hours");
	
	hours4= input.nextDouble();
	input.close();
	days2= hours4/24;
	
	System.out.println("your time in days is " +days2);
	
}


public static void main(String[] args) {
	
	int choice;
	
	Scanner input= new Scanner(System.in);
	
	System.out.println("1. hours to minutes conversion");
	System.out.println("2. minutes to hours conversion");
	System.out.println("3. days to hours conversion");
	System.out.println("4. hours to days conversion");
	choice= input.nextInt();
	
	if (choice == 1) {
		hourstominutes();
		}
	
	if (choice==2) {
		minutestohours();
	}
	
	if (choice==3) {
		daystohours();
	}
	
	if (choice==4) {
		hourstodays();
	}
	
	
}}
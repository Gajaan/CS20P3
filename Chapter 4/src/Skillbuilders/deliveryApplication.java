package Skillbuilders;

import java.util.Scanner;

public class deliveryApplication {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the length of your package");
	       int length = input.nextInt();
	       
	       if(length <= 10)
	       System.out.println("Your length has been accepted");
	       
	       else if(length > 10)
	    	   System.out.println("Your length has been rejected");
	       
	    System.out.println("enter the width of your package");
	    	int width = input.nextInt();
	    	
	    	 if(width <= 10)
	  	       System.out.println("Your width has been accepted");
	  	       
	  	       else if(width > 10)
	  	    	   System.out.println("Your width has been rejected");
	    	
	    System.out.println("enter the height of your package");
	    	int height = input.nextInt();
	    	
	    	 if(height <= 10)
	  	       System.out.println("Your height has been accepted");
	  	       
	  	       else if(height > 10)
	  	    	   System.out.println("Your height has been rejected");
	    	
		
		
}
}
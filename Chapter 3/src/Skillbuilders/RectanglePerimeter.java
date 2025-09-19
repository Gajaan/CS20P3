package Skillbuilders;

import java.util.Scanner;

public class RectanglePerimeter {

	public static void main(String[] args) {
		//Declaration- the space is getting prepared
		  Scanner scanner = new Scanner(System.in);
		  System.out.print("Enter the width of the rectangle: ");
	        int width = scanner.nextInt();
	        
	        System.out.print("Enter the length of the rectangle: ");
	        int length = scanner.nextInt();


//initialization
 //width =4;
 //length=13;
 
 System.out.println("this is the width:" + width);
 System.out.println("this is the length: " + length);
 
 int perimeter = 2*width + 2*length;
 
 System.out.println("your total perimeter is " + perimeter );

	}

}

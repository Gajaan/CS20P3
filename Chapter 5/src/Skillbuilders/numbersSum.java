package Skillbuilders;

import java.util.Scanner;

public class numbersSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   

        System.out.print("Enter a number: ");
        int num = input.nextInt();                

        int count = 1;                            
        int sum = 0;                              

        while (count <= num) {                  
            System.out.println(count);           
            sum += count;                        
            count++;                             
        }

        System.out.println("Sum = " + sum);       // 
    }
}
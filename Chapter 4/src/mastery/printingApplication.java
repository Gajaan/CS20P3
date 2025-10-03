package mastery;
import java.util.Scanner;

public class printingApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many copies do you want to print? ");
        int copies = input.nextInt();

        double pricePerCopy;
        
        if (copies < 99) 
            pricePerCopy = 0.30;
         else if (copies < 499) 
            pricePerCopy = 0.28;
         else if (copies < 749) 
            pricePerCopy = 0.27;
         else if (copies < 1000) 
            pricePerCopy = 0.26;
         else 
            pricePerCopy = 0.25;
        

        double totalPrice = Math.round(copies * pricePerCopy);
        System.out.println("It will be $" + pricePerCopy + " per copy.");
        System.out.println("The total price will be $" + totalPrice);
    }
}

package Skillbuilders;

import java.util.Scanner;

public class percentPassing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalScores = 0;
        int passingScores = 0;
        double score;

        System.out.println("Enter scores one by one (enter a negative number to stop):");

        score = input.nextDouble();

        while (score >= 0) {
            totalScores++;
            if (score >= 70) {
                passingScores++;
            }
            score = input.nextDouble();
        }

        if (totalScores > 0) {
            double percentPassing = (double) passingScores / totalScores * 100;
            System.out.println("Percentage of scores above 70%: " + percentPassing + "%");
        } else {
            System.out.println("No scores entered.");
        }
    }
}

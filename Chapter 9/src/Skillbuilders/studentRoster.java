package Skillbuilders;

import java.util.Scanner;

public class studentRoster {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("How many students are in the class");
        int students = input.nextInt();

        String[] stdnts = new String[students];

        System.out.println("Enter each student's name");
        for (int i = 0; i < students; i++) {
            stdnts[i] = input.next();
        }

        System.out.println("Student Roster:");
        for (int i = 0; i < students; i++) {
            System.out.println(stdnts[i]);
        }
    }
}


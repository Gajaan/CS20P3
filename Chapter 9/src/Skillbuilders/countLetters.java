package Skillbuilders;

import java.util.Scanner;

public class countLetters {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a phrase:");
        String phrase = input.nextLine().toLowerCase();
        
        int[] counts = new int[26];
        
        for (int i = 0; i < phrase.length(); i++) {
            char ch = phrase.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                counts[ch - 'a']++;
            }
        }
        
        for (int i = 0; i < 26; i++) {
            System.out.println((char)(i + 'a') + ": " + counts[i]);
        }
    }
}


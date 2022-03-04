package edu.fju;

import java.util.Random;
import java.util.Scanner;

public class Guess1To100{
    public static void main(String[] args) {
        System.out.println("Please enter a number between 1 to 100.");
        Random r = new Random();
        boolean win = false;
        int min = 1;
        int max = 100;
        int secretn = r.nextInt(100) + 1;
        System.out.println(secretn);
        for (int x=0;x<5;x++){
            Scanner s = new Scanner(System.in);
            String w = s.next();
            int number = Integer.parseInt(w);
            if (number < secretn) {
                min = number;
                System.out.println("Please enter a number between " + min + " to " + max);
            } else if (number > secretn) {
                max = number;
                System.out.println("Please enter a number between " + min + " to " + max);
            } else if (number == secretn) {
                win = true;
                System.out.println("You win, the number is " + secretn + ".");
                break;
            }
        }if (win = false) {
            System.out.println("You lose, the number is " + secretn + ".");
        }
    }
}


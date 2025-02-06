package LAB7;

import java.util.Scanner;

/**
 * Created by:
 * Created on:
 * Program to read in a list of numbers and find the largest
 */
public class LargestNumber {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int TERMINATOR = -999;
        int number, largest;
        System.out.print("Enter the first number: ");
        number = keyboard.nextInt();
        largest = number;
        while (number != TERMINATOR) {
            if (number > largest) {
                largest = number;
            }//if
            System.out.print("Enter a number (or -999 to finish): ");
            number = keyboard.nextInt();
        }//while
        System.out.println("\nThe largest number is " + largest);
    }//main
}//class
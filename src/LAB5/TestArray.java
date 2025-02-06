package LAB5;

import java.util.Scanner;

/*
 * Program to read in 8 integers, calculate number of odd,
 * number of even, sum and average
 */

public class TestArray {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        final int MAX = 8;
        int[] myNumbers = new int[MAX];
        int noOfOdd = 0, sum = 0;

        //Read in and store numbers
        for (int index = 0; index < MAX; index++) {
            System.out.print("Enter an integer: ");
            myNumbers[index] = keyboard.nextInt();
        }//for

        //Calculate number of odd numbers and sum of numbers
        for (int index = 0; index < MAX; index++) {
            if (myNumbers[index] % 2 != 0) {
                noOfOdd++;
            }//if
            sum = sum + myNumbers[index];
        }//for

        //Print out the results
        System.out.println("\nThere are " + noOfOdd + " odd numbers and " + (MAX - noOfOdd) + " even numbers");
        System.out.println("\nThe sum of the integers is " + sum);
        System.out.println("\nThe average of the integers is " + ((double) sum / MAX));
    }//main
}//class


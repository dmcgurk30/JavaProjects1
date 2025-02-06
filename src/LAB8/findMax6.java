package LAB8;

import java.util.*;
    /**
     * Created by:
     * Created on:
     * Program to read in 2 pairs of numbers and output the larger one
     * of each pair
     */

    public class findMax6 {
        static Scanner keyboard = new Scanner(System.in);

        // Method to read in and return a number
        public static int getNumber() {
            System.out.print("Please enter a number: ");
            return keyboard.nextInt();
        } //getNumber

        // Method to return the larger of 2 numbers
        public static int max(int num1, int num2) {
            int larger;
            if (num1 > num2) {
                larger = num1;
            } //if
            else {
                larger = num2;
            } //else
            return larger;
        } //max

        // Method to print out a number
        public static void printAnswer(int num) {
            System.out.println(num + " is the larger number");
        } //printAnswer

        public static void main(String[] args) {
            int number1, number2;

            // Read in and print out larger of 2 numbers
            number1 = getNumber();
            number2 = getNumber();
            printAnswer(max(number1, number2));

            // Read in and print out larger of another 2 numbers
            number1 = getNumber();
            number2 = getNumber();
            printAnswer(max(number1, number2));
        } //main
    } //class

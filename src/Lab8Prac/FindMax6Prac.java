package Lab8Prac;

import java.util.*;

public class FindMax6Prac {
    static Scanner keyboard = new Scanner(System.in);

    //method to read in and return a number
    public static int getNumber() {
        System.out.println("Please enter a number");
        return keyboard.nextInt();
    }//getNumber

    // Method to return the larger of 2 numbers
    public static int max(int num1, int num2) {
        int larger;
        if (num1 > num2) {
            larger = num1;
        }//if
        else {
            larger = num2;
        }//else
        return larger;
    }//max

    //Method to print out a number
    public static void printAnswer(int num) {
        System.out.println(num + " is the larger number");
    }//printAnswer

    public static void main(String[] args) {
        int number1, number2;

        //read in and print out larger of the 2 numbers
        number1 = getNumber();
        number2 = getNumber();
        printAnswer(max(number1, number2));

        //read in and print out the larger of another 2 numbers
        number1 = getNumber();
        number2 = getNumber();
        printAnswer(max(number1, number2));
    }
}


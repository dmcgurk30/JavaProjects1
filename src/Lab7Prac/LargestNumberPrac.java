package Lab7Prac;

import java.util.Scanner;


public class LargestNumberPrac {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        final int TERMINATOR = -999;
        int number, largest;
        System.out.println("enter the first number");
        number = keyboard.nextInt();
        largest = number;

        while (number != TERMINATOR) {
            if (number > largest) {
                largest = number;
            }//if
            System.out.println("enter a number (or -999 to finish");
            number = keyboard.nextInt();
        }//while

        System.out.println("\n The largest number is " + largest);
    }
}

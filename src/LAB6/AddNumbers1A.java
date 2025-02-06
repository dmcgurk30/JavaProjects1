package LAB6;

import java.util.Scanner;
    /**
     * Created by:
     * Created on:
     * Program to read in numbers, add them and output their total
     */
    public class AddNumbers1A {

        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            final int HOWMANY = 3;
            int number, total = 0;
            for (int count = 0; count < HOWMANY; count++) {
                System.out.print("Enter a number : ");
                number = keyboard.nextInt();
                total = total + number;
            }//for
            System.out.println("\nThe total of the numbers is " + total);
        }//main
    }//class

package LAB3_PREP;

import java.util.Scanner;


public class ReadIntVariables {
    /**
     * Created by:
     * Created on:
     * Program to read 2 integer values from the keyboard to represent
     *    length and breadth and print them out
     */

        public static void main(String[] args) {

            Scanner keyboard = new Scanner(System.in);

            // Declare two integer variables for length and breadth
            int length, breadth;

            // Read in values for length and breadth
            System.out.println("Please enter a value for the length");
            length = keyboard.nextInt();

            System.out.println("Please enter a value for the breadth");
            breadth = keyboard.nextInt();

            // Output the values entered for length and breadth
            System.out.println("The value entered for length is " + length);
            System.out.println("The value entered for breadth is " + breadth);

        }//main
    }//class

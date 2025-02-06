package LAB7;

import java.util.Scanner;

    /**
     * Created by:
     * Created on:
     * Program to randomly generate and print 2 numbers representing two
     die
     *    until the user wishes to stop
     */

    public class dice {
        public static void main(String[] args) {

            Scanner keyboard = new Scanner(System.in);

            int die1, die2;
            char response;

            do {
                die1 = (int) ((Math.random() * 6) + 1);
                die2 = (int) ((Math.random() * 6) + 1);
                System.out.println("The numbers are " + die1 + " and " +
                        die2);
                System.out.print("Do you want to continue (Y/N)? ");
                response = keyboard.nextLine().charAt(0);
            } while (response == 'Y');

        }//main
    }//class

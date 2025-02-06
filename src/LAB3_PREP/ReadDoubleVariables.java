package LAB3_PREP;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by:
 * Created on:
 * Program to read double values from the keyboard and print them out
 */

public class ReadDoubleVariables {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        // Declare two double variables for price1 and price2
        double price1, price2;

        // Read in values for price1 and price2
        System.out.print("Please enter a value for price 1: ");
        price1 = keyboard.nextDouble();

        System.out.print("Please enter a value for price 2: ");
        price2 = keyboard.nextDouble();

        // Output the values entered for price1 and price2
        System.out.println("The value entered for price 1 is " + df.format(price1));
        System.out.println("The value entered for price 2 is " + df.format(price2));
    }//main
}//class
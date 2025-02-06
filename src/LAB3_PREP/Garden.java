package LAB3_PREP;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * A program that reads in the length of the side of a square garden
 * and the radius of a pond in the garden, then calculates and
 * prints out the area of grass on the lawn
 */
public class Garden {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner keyboard = new Scanner(System.in);

        // Declare variables
        double length, radius, area;
        // Read in the length of the garden
        System.out.print("Enter the length of the garden (in metres) : ");
        length = keyboard.nextDouble();

        // Read in the radius
        System.out.print("Enter the radius of the pond (in metres)   : ");
        radius = keyboard.nextDouble();

        // Calculate area
        area = Math.pow(length, 2) - (Math.PI * Math.pow(radius, 2));

        // Output results
        System.out.println("\nThe area of the lawn is " + df.format(area) + " m squared");
    }//main
}//class
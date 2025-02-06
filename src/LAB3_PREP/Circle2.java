package LAB3_PREP;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by:
 * Created on:
 * Program to calculate and output the diameter, circumference and area of a
 *    circle given the radius
 */

public class Circle2 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        // Declare the variables
        double radius, diameter, area, circumference;

        // First - get the radius of the circle
        System.out.print("Please, enter the radius of a circle: \t");
        radius = keyboard.nextDouble();

        // Calculate diameter
        diameter = 2 * radius;

        // Calculate circumference
        circumference = 2 * Math.PI * radius;


// Calculate area
        area = Math.PI * Math.pow(radius, 2);

        // Output results
        System.out.println("The radius is " + df.format(radius) + " units");
        System.out.println("The diameter is " + df.format(diameter) + " units");
        System.out.println("The circumference is " + df.format(circumference) + " units");
        System.out.println("The area is " + df.format(area) + " units squared");

    }//main
}//class
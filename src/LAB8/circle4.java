package LAB8;

import java.text.DecimalFormat;
import java.util.Scanner;

    /**
     * Created by:
     * Created on:
     * Program to read in the radius of a circle, calculate and output the
     * circumference and area.
     */

    public class circle4 {

        // Method to calculate and return the circumference
        public static double getCircumference(double pRadius) {
            double answer;
            answer = 2 * Math.PI * pRadius;
            return answer;
        } //getCircumference

        // Method to calculate and return the area
        public static double getArea(double pRadius) {
            return Math.PI * Math.pow(pRadius, 2);
        } //getArea

        public static void main(String[] args) {
            DecimalFormat df = new DecimalFormat("0.00");
            Scanner keyboard = new Scanner(System.in);

            // Declare variables
            double radius, circumference, area;

            // Read in the radius
            System.out.print("Enter the radius of the circle (in cms) : ");
            radius = keyboard.nextDouble();

            // Call getCircumference(…) method
            circumference = getCircumference(radius);

            // Call getArea(…) method
            area = getArea(radius);

            // Output results
            System.out.println("The circumference is " + df.format(circumference) + " cms");
            System.out.println("The area is " + df.format(area) + " cm squared");
        } //main
    } //class

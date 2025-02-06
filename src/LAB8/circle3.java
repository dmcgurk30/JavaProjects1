package LAB8;

import java.util.Scanner;
import java.text.DecimalFormat;

  /**
  * Created by:
  * Created on:
 Circle3.java
  * Program to read in the radius of a circle, calculate and output the
  * circumference and area.
  */

    public class circle3 {
        static double radius;
        // Method to calculate and return the circumference


        public static double getCircumference() {
        double answer;
        answer = 2 * Math.PI * radius;
        return answer;

        }//getCircumference

        // Method to calculate and return the area


        public static double getArea() {
        return Math.PI * Math.pow(radius, 2);
        }//getArea

        public static void main(String[] args) {
            DecimalFormat df = new DecimalFormat("0.00");
            Scanner keyboard = new Scanner(System.in);

            // Declare variables
            double circumference, area;

            // Read in the radius
            System.out.print("Enter the radius of the circle (in cms) : ");
            radius = keyboard.nextDouble();

            // Call getCircumference() method
            circumference = getCircumference();

            // Call getArea() method
            area = getArea();

            // Output results
            System.out.println("The circumference is " + df.format(circumference)
                    + " cms");
            System.out.println("The area is " + df.format(area) + " cm squared");
        }//main
    }//class


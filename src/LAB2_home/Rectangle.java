package LAB2_home;

import java.text.DecimalFormat;
/**
 * Created by:
 * Created on:
 * Program to calculate and print out the perimeter and
 *
 area of a rectangle
 */
public class Rectangle {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("00.00");
// Declare 4 variables to hold length,
// breadth, perimeter and area
        double length, breadth, area, perimeter;
// Assign values to length and breadth
        length = 24.7;
        System.out.println("Rectangle length  = " + df.format(length));
        breadth = 25.9;
        System.out.println("Rectangle breadth = " + df.format(breadth));
// Calculate, store and print out the area
        area = length * breadth;
        System.out.println("Rectangle Area = " + df.format(area));
// Calculate, store and print out the perimeter
        perimeter = (length + breadth) * 2.0;
        System.out.println("Rectangle Perimeter = " +
                df.format(perimeter));
    }//main
}//class

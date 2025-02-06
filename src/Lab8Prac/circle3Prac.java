package Lab8Prac;

import java.util.Scanner;
import java.text.DecimalFormat;

public class circle3Prac {
    static double radius;

    // Method to calculate and return the circumference

    public static double getCircumference() {
        double answer;
        answer = 2 * Math.PI * radius;
        return answer;

    }// getCircumference

    //method to calculate and return the area

    public static double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }//getArea


    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner keyboard = new Scanner(System.in);

        //declare variables
        double circumference, area;

        // read in radius
        System.out.println("enter the radius (in cms)  : ");
        radius = keyboard.nextDouble();

        // Call getCircumference() method
        circumference = getCircumference();

        //call getArea() method
        area = getArea() ;

        //outputs
        System.out.println("the circumference is " +  df.format(circumference)
                + " cms");
        System.out.println("The area is " + df.format(area) + " cm squared");
    }//main
}//class)
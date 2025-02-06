package LAB6;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * Created by:
 * Created on:
 * Program to read in numbers, add them and output their average
 */
public class Average {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00.00");
        int noOfValues, value;
        double total = 0, averageValue;
//Read number of values
        System.out.print("How many numbers are you entering? ");
        noOfValues = keyboard.nextInt();
//Read in the numbers
        for (int count = 0; count < noOfValues; count++) {
            System.out.print("Enter a number : ");
            value = keyboard.nextInt();
            total = total + value;
        }//for
//Calculate and output the average
        averageValue = total / noOfValues;
        System.out.println("\nThe average of the " + noOfValues + " numbers is " + df.format(averageValue));
    }//main
}//class

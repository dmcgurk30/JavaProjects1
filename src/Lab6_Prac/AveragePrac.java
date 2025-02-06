package Lab6_Prac;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AveragePrac {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00.00");

        int noOfValues, value;
        double total = 0, averageValue;

        // Read number of values

        System.out.println("How many numbers are you entering");
        noOfValues = keyboard.nextInt();

        //Read in the numbers
        for (int count = 0; count <noOfValues; count++) {
            System.out.println("enter a value");
            value = keyboard.nextInt();
            total = total + value;
        }
        //Calculate and output the average
        averageValue = total /noOfValues;
        System.out.println("\n the average of the " + noOfValues + " numbers is " + df.format(averageValue));

    }
}

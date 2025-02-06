package LAB3_PREP;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConvertMiles {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");
        Scanner keyboard = new Scanner(System.in);

        // Declare constants and variables
        final double MILETOKILO = 1.609;
        double miles, kilometers;

        // Prompt the user for the distance travelled in miles
        System.out.print("Please enter the distance travelled in miles:");
        miles = keyboard.nextDouble();

        // Calculate the number of kilometers
        kilometers = miles * MILETOKILO;

        // Output the distance travelled in kilometers
        System.out.println(df.format(miles) + " miles = " + df.format(kilometers) + " kilometers");

    }//main
}//class
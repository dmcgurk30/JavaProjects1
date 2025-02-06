package LAB4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Pay2 {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");
        Scanner keyboard = new Scanner(System.in);


// Set the hourly rate of pay
        final double BASICRATE = 5.95, OVERTIMERATE = 8.50;
        final int BASICHOURS = 40;
// Declare variables
        String name;
        int hours;
        double total;

        System.out.println( "Please enter your name ");
        name = keyboard.nextLine( );

        // Prompt for and read in the number of hours worked
        System.out.print("How many hours did you work this week? ");
        hours = keyboard.nextInt();
// Calculate and output the total pay
        if (hours <= BASICHOURS) {
            total = hours * BASICRATE;
        }//if
        else {
            total = ((BASICHOURS * BASICRATE) + ((hours - BASICHOURS) *
                    OVERTIMERATE));
        }//else
// Output the total pay
        System.out.println("\n" + name + ", your total pay for this week is : £ " + df.format(total));


    } //main
} //class

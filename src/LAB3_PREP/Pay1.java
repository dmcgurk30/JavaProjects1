package LAB3_PREP;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Program to read in a person's name and hours worked and
 * output the person's total pay
 */

public class Pay1 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        // Set the hourly rate of pay
        final double HOURLYRATE = 5.95;

        // Declare variables
        String firstName, middle, surname;
        char initial;
        double hours, total;

        // Prompt for and read in the person's name
        System.out.print("Please enter your first name: ");
        firstName = keyboard.nextLine();
        System.out.print("Please enter your middle initial: ");
        middle = keyboard.nextLine();
        initial = middle.charAt(0);
        System.out.print("Please enter your surname: ");
        surname = keyboard.nextLine();

        // Prompt for and read in the number of hours worked
        System.out.print("\nHow many hours did you work this week? ");
        hours = keyboard.nextDouble();

        // Calculate the total pay
        total = hours * HOURLYRATE;

        // Output the total pay
        System.out.println("\n" + firstName + initial + " " + surname + ", " +
                "your total pay is: £" + df.format(total));

    } //main
} //class

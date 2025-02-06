package LAB3_PREP;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by:
 * Created on:
 * Program to read in the cost of an item, the amount of money tendered, then
 *    calculate and output the change due
 */
public class Change {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");
        Scanner keyboard = new Scanner(System.in);

        // Declare variables
        double cost, amount, change;

        // Read in the cost of the item
        System.out.print("How much does the item cost?  £");
        cost = keyboard.nextDouble();

        // Read in the amount tendered
        System.out.print("How much has been tendered?  £");
        amount = keyboard.nextDouble();

        // Calculate change
        change = amount - cost;


// Output results
        System.out.println("Amount Due:\t\t\t£" + df.format(cost));
        System.out.println("Amount Tendered:\t£" + df.format(amount));
        System.out.println("Change Due:\t\t\t£" + df.format(change));
    }//main
}//class
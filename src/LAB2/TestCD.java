package LAB2;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Program to test CD Class
 */

public class TestCD {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("0.00");

      // Create myCD and print out the details
      CD myCD;
      myCD = new CD("Bob Marley", "Legend", 1980, true);
      myCD.printAllInfo();

      // Create yourCD and print out the details
      CD yourCD = new CD("Nick of Time", "Bonnie Raitt", 6.25, 11.99, 1989, true);
      yourCD.printAllInfo();

      // Print out the year myCD was issued
      System.out.println("myCD was issued in " + myCD.getYear() + "\n");

      // Update cost and sale prices of yourCD and print out the details
      yourCD.updatePrices(2.50);
      yourCD.printAllInfo();

      // Output the profit on yourCD
      System.out.print("The profit for yourCD is £" + df.format(yourCD.getProfit()) + "\n");

   }//main
}//class

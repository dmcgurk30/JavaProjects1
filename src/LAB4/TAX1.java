package LAB4;

import java.util.Scanner;
import java.text.DecimalFormat;

public class TAX1 {
    public static void main(String[] args) {

        Scanner Keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        final int TAXLEVEL = 10000;
        final double TAXRATE = 0.20;
        double grossPay, tax = 0, netPay;

        // Prompt for and read in the gross pay
        System.out.print("Pleas enter your Gross Pay: £");
        grossPay = Keyboard.nextDouble();

        // Calculate tax and net pay
        if (grossPay > TAXLEVEL){
             tax = (grossPay - TAXLEVEL) * TAXRATE;

        }//if
        netPay = grossPay - tax;

        // Output gross pay, tax and net pay
        System.out.println("Gross Pay:\t\t£" + df.format(grossPay));
        System.out.println("Tax:\t\t\t£" + df.format(tax));
        System.out.println("Net Pay:\t\t£" + df.format(netPay));

    }//main
}//class

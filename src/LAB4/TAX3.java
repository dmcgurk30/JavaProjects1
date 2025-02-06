package LAB4;

import java.util.Scanner;
import java.text.DecimalFormat;

public class TAX3 {
    public static void main(String[] args) {

        Scanner Keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");


        final int LOWTAXLEVEL = 10000, HIGHTAXLEVEL = 40000;
        final double LOWTAXRATE = 0.20, HIGHTAXRATE = 0.40;

        double grossPay, tax = 0, netPay;

        System.out.println("Please enter your Gross pay : £");
        grossPay = Keyboard.nextDouble();

        if (grossPay > HIGHTAXLEVEL) {
            tax = ((grossPay - HIGHTAXLEVEL) * HIGHTAXRATE) +
                    ((HIGHTAXLEVEL - LOWTAXLEVEL) * LOWTAXRATE);
        }

        else {
            if (grossPay > LOWTAXLEVEL) {
                tax = (grossPay - LOWTAXLEVEL) * LOWTAXRATE;
            }//if
        }//else

        netPay = grossPay-tax;

        System.out.println("\nGross Pay: \t\t£" + df.format(grossPay));
        System.out.println("Tax: \t\t\t£" + df.format(tax));
        System.out.println("Net Pay: \t\t£" + df.format(netPay));


    }//main
}//class

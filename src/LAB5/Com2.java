package LAB5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Com2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("£0,000.00");


        final int MAX = 10;
        int[] sales = new int[MAX];
        int total = 0;
        double commissionLevel;

        //Read in and store values of sales
        for (int index = 0; index < MAX; index++) {
            System.out.print("Enter sales of Salesman " + (index + 1) + ": ");
            sales[index] = keyboard.nextInt();
        }//for

        //claculate commission level
        for (int index = 0; index < MAX; index++) {
            total = total + sales[index];
        }
        commissionLevel = (double) ((total / MAX) * 2 / 3);

        System.out.println("\nThe following Salesmen qualify for Commission");
        System.out.println("Reference No\t\tAmount");
        for (int index = 0; index < MAX; index++) {
            if (sales[index] > commissionLevel) {
                System.out.println("\t" + (index + 1) + "\t\t\t\t" + df.format((sales[index] - commissionLevel)));
            }//if
        }//for




    }
}

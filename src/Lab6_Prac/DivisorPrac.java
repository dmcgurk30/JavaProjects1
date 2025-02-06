package Lab6_Prac;

import java.util.Scanner;

public class DivisorPrac {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int start, finish, divisor;
        int noOfNumbers = 0, total = 0;
        double average;
        int count2 = 0;

//Enter the start number, finish number and divisor
        System.out.print("Enter the start number: ");
        start = keyboard.nextInt();
        System.out.print("Enter the finish number: ");
        finish = keyboard.nextInt();
        System.out.print("Enter the divisor: ");
        divisor = keyboard.nextInt();

        //Output multiples
        for (int count = start; count <= finish; count++) {
            if (count % divisor == 0) {
                total = total + count;
                System.out.println(count);
            }
        }
        System.out.println("\n\nThe total of numbers evenly divisible is: " + total);
        System.out.println("\n\n The number of numbers evenly divisible was: " + noOfNumbers + " out of " + count2);

        average = (double) total/noOfNumbers;
        System.out.println("\n\nThe average of numbers evenly divisible is " + average);

    }//main
}//class

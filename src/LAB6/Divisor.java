package LAB6;
import java.util.Scanner;
/**
 * Created by:
 * Created on:
 * Program to read in a start and finish number, then read in
 * a divisor and print out all integers between start and finish
 * which are evenly divisible by the divisor
 */
public class Divisor {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int start, finish, divisor;
        int noOfNumbers = 0, total = 0;
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
                noOfNumbers = noOfNumbers + 1;
                total = total + count;
                System.out.println(count);
            }//if
        }// for
    }//main
}//class

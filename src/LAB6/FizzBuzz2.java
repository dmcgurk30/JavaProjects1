package LAB6;
import java.util.Scanner;
/**
 * Created by:
 * Created on:
 * Program to read 2 integers from the keyboard representing the
 * start and finish number and output
 * FIZZ if evenly divisible by 3
 * BUZZ if evenly divisible by 7
 * otherwise output the number
 * for all numbers between start and finish (inclusive)
 */
public class FizzBuzz2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
//Declare variables
        int start, finish;
//Enter start and finish values
        System.out.print("Enter a Start number: ");
        start = keyboard.nextInt();
        System.out.print("Enter a Finish number: ");
        finish = keyboard.nextInt();
        for (int count = start; count <= finish; count += 1) {
//Check if number is evenly divisible by 3 and/or 7 and output results
            if ((count % 3 == 0) || (count % 7 == 0)) {
                if (count % 3 == 0) {
                    System.out.print("FIZZ ");
                }//if
                if (count % 7 == 0) {
                    System.out.print("BUZZ ");
                }//if
                System.out.print("\t\t");
            }//if
            else {
                System.out.print(count + "\t\t\t");
            }//else
        }//for
    }//main
}//class

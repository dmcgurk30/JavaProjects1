package LAB5;

import java.util.Scanner;

public class FizzBuzz1 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

    // Declare variables
        int number;

        System.out.println("Enter an integer: ");
        number = keyboard.nextInt();

        //Check if number is evenly divisible by 3 and/or 7 and output results

        if ((number % 3 == 0) || (number % 7 == 0)) {
            if (number % 3 == 0) {
                System.out.print("FIZZ");
            }//if
            if (number % 7 == 0) {
                System.out.println("BUZZ");
            }//if
        }//if
        else {
            System.out.println(number);
        }//else

    }//main
}//class

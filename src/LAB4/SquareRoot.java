package LAB4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {

        Scanner Keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double number;
        double squareRoot;


        System.out.println("Please enter your number ");
        number = Keyboard.nextDouble();
        squareRoot = Math.sqrt(number);
        if (number >= 0) {
            System.out.println(" The square root of " + number + " is " + squareRoot);

        }
            else {
                if (number < 0) {
                    System.out.println(number + " the number has no square root ");
                }//if
            }//else

        }//main

    }//class
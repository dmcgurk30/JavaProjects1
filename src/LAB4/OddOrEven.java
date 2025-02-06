package LAB4;

import java.util.Scanner;


public class OddOrEven {

    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);


        int number;

        System.out.println("Please enter your number ");
        number = keyboard.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " the number is even");
        }//if
        else {
            if (number % 2 != 0) {
                System.out.println( number + " the number is odd ");
            }//if
            }//else

    }//main

}//class


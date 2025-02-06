package LAB4;

import java.util.Scanner;


public class TestNumber {

    public static void main(String[] args) {

        Scanner Keyboard = new Scanner(System.in);


        int number;
        final int CONSTANT = 20;


        System.out.println("Please enter your number ");
        number = Keyboard.nextInt();

        if (number > CONSTANT) {
            System.out.println(" The number  " + number + " is greater than 20 ");
        } else {
            if (number < CONSTANT) {
                System.out.println(" The number  " + number + "is lesser than 20 ");
            }
        }
    }//main
}//class



package LAB4;


import java.util.Scanner;


public class GuessNumber {
    public static void main(String[] args) {

        Scanner Keyboard = new Scanner(System.in);

        int setanswer = 50;
        int guess;

        System.out.println("Please enter your guess ");
        guess = Keyboard.nextInt();

        if (guess == setanswer) {
            System.out.println(" You are correct ");
        }

        else {
            if (guess != 50) {
                System.out.println("you are incorrect ");
            }
        }

        }//main
    }// class

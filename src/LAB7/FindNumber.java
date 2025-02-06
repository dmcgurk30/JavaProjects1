package LAB7;

public class FindNumber {


    /**
     * Created by:
     * Created on:
     * Program to randomly generate a number between 0 and 9 (inclusive)
     * until the correct number is guessed
     */

        public static void main(String[] args) {

            final int CORRECTNUMBER = 5;
            int guess, count = 0;

            do {
                guess = (int) ((Math.random() * 10));
                count = count + 1;
                System.out.println("The number guessed is " + guess);
            } while (guess != CORRECTNUMBER);

            System.out.println("\nIt took " + count + " attempts to guess the number " + CORRECTNUMBER);

        }//main
    }//class
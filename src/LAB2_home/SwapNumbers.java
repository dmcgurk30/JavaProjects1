package LAB2_home;

    /**
     * Created by:
     * Created on:
     * Program to swap two numbers
     */
    public class SwapNumbers {
        public static void main(String[] args) {
            int number1, number2;
            number1 = 25;
            number2 = 39;
            int temp;
// declare 2 integer variables
            // store 25 in number1
            // store 39 in number2
// declare third variable to  act

//Print out initial values to screen
            System.out.println("The value of number1 is " + number1);
            System.out.println("The value of number2 is " + number2);
            System.out.println();
            temp = number1;
            number1 = number2;
            number2 = temp;
            // copy value of number1 into temp
// copy value in number2 into number1
            // copy value in temp into number2
// Print out new values to screen
            System.out.println ("Value of number1 is now " + number1);
            System.out.println ("Value of number2 is now " + number2);
        }//main
    }//class
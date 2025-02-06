package LAB6;

/**
 * Created by:
 * Created on:
 * Program to print out the odd numbers from 1 to 50
 */
public class OddNumbers {
    public static void main(String[] args) {
        double average;
        int total = 0;
        int noOfOdd = 0;
        for (int number = 1; number <= 50; number++) {
            if (number % 2 != 0) {
                System.out.println(number);
                noOfOdd++;
                total = total + number;
            }//if
        }//for
        average = (double) total / noOfOdd;
        System.out.println("The total of these numbers is : " + total);
        System.out.println("The average of these numbers is: " +
                average);
    }//main
}//class

package LAB7;

import java.util.Scanner;

    /**
     * Created by:
     * Created on:
     * Program to read in the names and amounts from each donor until the
     * target of £500 is reached
     * and output the details of the largest donor and the number of
     * donations
     */
    public class Donations {

        public static void main(String[] args) {

            Scanner keyboard = new Scanner(System.in);

            final int TARGET = 500;
            String name, largestDonorName = "";
            int donation, total = 0, noOfDonations = 0, largestDonation = 0;

            do {
                System.out.println("Enter the donor's name:");
                name = keyboard.next();
                System.out.println("Enter the amount of the donation:");
                donation = keyboard.nextInt();
                System.out.println();
                total = total + donation;
                noOfDonations = noOfDonations + 1;
                if (donation > largestDonation) {
                    largestDonation = donation;
                    largestDonorName = name;
                }
            } while (total < TARGET);

            System.out.println("There were " + noOfDonations + " donations");
            System.out.println("The largest donor was " + largestDonorName);

        }//main
    }//class

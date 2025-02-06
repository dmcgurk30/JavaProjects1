package Lab7Prac;

import java.util.Scanner;

public class DonationsPrac {

    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);

        final int TARGET = 500;
        String name, largestDonorName = "";
        int donation, total = 0, noOfDonations = 0, largestDonation = 0;

        do {
            System.out.println("enter the donors name: ");
            name = keyboard.next();
            System.out.println("enter the amount of the donation: ");
            donation = keyboard.nextInt();
            System.out.println();
            total = total + donation;
            noOfDonations = noOfDonations + 1;
            if (donation > largestDonation) {
                largestDonation = donation;
                largestDonorName = name;
            }
        }while (total < TARGET);
        System.out.println("There were " + noOfDonations + " donations");
        System.out.println("The largest donor was " + largestDonorName);
        }


    }

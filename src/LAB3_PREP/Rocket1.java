package LAB3_PREP;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by:
 * Created on:
 * Program to read in the take-off time and flight time of a rocket
 * and calculates and outputs the estimated arrival time
 */

public class Rocket1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00");

        final int SECMINHOUR = 60;
        final int HOURSINDAY = 24;

        int takeOffHour, takeOffMinute, takeOffSecond;
        int flightTime;
        int arrivalHour, arrivalMinute, arrivalSecond;

        // Read in the Take-Off time
        System.out.println("What is the take-off time (24-hour clock):");
        System.out.print("Hour:    ");
        takeOffHour = keyboard.nextInt();
        System.out.print("Minutes: ");
        takeOffMinute = keyboard.nextInt();
        System.out.print("Seconds: ");
        takeOffSecond = keyboard.nextInt();

        System.out.print("\nHow long is the flight time (in seconds)? ");
        flightTime = keyboard.nextInt();

        // Calculate arrival time
        arrivalSecond = takeOffSecond + flightTime;
        arrivalMinute = takeOffMinute + (arrivalSecond / SECMINHOUR);
        arrivalSecond = arrivalSecond % SECMINHOUR;
        arrivalHour = takeOffHour + (arrivalMinute / SECMINHOUR);
        arrivalMinute = arrivalMinute % SECMINHOUR;
        arrivalHour = arrivalHour % HOURSINDAY;

        // Output results
        System.out.println("\nTake-off Time:\t\t\t\t" + df.format(takeOffHour) + ":" +
                df.format(takeOffMinute) + ":" + df.format(takeOffSecond));
        System.out.println("Flight Time:\t\t\t\t" + flightTime + " seconds");
        System.out.println("Expected Arrival Time:\t\t" + df.format(arrivalHour) + ":" +
                df.format(arrivalMinute) + ":" + df.format(arrivalSecond));

    }//main
}//class
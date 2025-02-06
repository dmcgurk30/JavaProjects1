package LAB2_home;

/**
 * Created by:
 * Created on:
 * Program to convert a time in seconds to hours, minutes and seconds
 */
public class Display_time {
    public static void main(String[] args) {
        int seconds = 500;
        int remainingSeconds, minutes;
        minutes = seconds / 60;
        remainingSeconds = seconds % 60;
        System.out.println(seconds + " seconds = " + minutes + " minutes and " + remainingSeconds + " seconds");
    }//main
}//class

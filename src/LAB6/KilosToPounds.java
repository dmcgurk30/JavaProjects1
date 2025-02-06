package Lab6;
import java.text.DecimalFormat;
/**
 * Created by:
 * Created on:
 * Program to print out kilograms from 5 to 100
 * and equivalent pounds
 */
public class KilosToPounds {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("00.0");
        final double POUNDSINKILO = 2.2;
        System.out.println("Kilograms\t\t\tPounds");
        for (int count = 5; count <= 100; count +=5) {
            System.out.println(count + "\t\t\t" + df.format((count *
                    POUNDSINKILO)));
        }//for
    }//main
}//class

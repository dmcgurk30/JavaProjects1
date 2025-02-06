package Lab6_Prac;
import java.text.DecimalFormat;

public class KilosToPoundsPrac {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("00.0");

        final double POUNDSINKILO =2.2;

        for (int kilograms = 5; kilograms <= 100; kilograms+=5) {
            System.out.println(kilograms + "\t\t\t" + df.format((kilograms * POUNDSINKILO )));
        }
    }
}
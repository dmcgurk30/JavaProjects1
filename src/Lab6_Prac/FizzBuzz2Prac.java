package Lab6_Prac;

import java.util.Scanner;

public class FizzBuzz2Prac {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int start, finish;

        System.out.println("please enter a start number ");
        start = keyboard.nextInt();
        System.out.println("please enter a finish number ");
        finish = keyboard.nextInt();

        for (int count = start; count <= finish; count+= 1) {

        //check if number is evenly divisible by 3 and/or 7  and output results
        if ((count % 3 ==0 ) || (count % 7 ==0 )) {
            if (count % 3 ==0) {
                System.out.println("FIZZ");
            }
            if (count % 7 == 0) {
                System.out.println("BUZZ");
            }
            else {
                System.out.println(count + "\t\t\t");
            }
        }
        }

    }

}

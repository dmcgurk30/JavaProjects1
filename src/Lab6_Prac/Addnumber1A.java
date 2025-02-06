package Lab6_Prac;

import java.util.Scanner;


public class Addnumber1A {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int howMany;
        System.out.println("how many numbers do you want to enter ");
        howMany = keyboard.nextInt();

        int number, total = 0;
        for (int count = 0; count < howMany; count++) {
            System.out.println("enter a number ");
            number = keyboard.nextInt();
            total = total + number;
        }

        System.out.println("\n The total of the number is " + total);
    }
}

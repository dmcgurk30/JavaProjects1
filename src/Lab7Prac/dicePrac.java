package Lab7Prac;

import java.util.Scanner;

public class dicePrac {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int die1, die2;
        char response;

        do {
            die1 = (int) ((Math.random() * 6) + 1);
            die2 = (int) ((Math.random() * 6) + 1);
            System.out.println("the numbers are " + die1 + die2);
            System.out.println("Do you want to continue (Y/N)");
            response = keyboard.nextLine().charAt(0);
        } while (response == 'Y');
    }
}

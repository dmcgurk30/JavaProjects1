package Lab6;

/**
 * Created by User1
 * COMMENTS ABOUT PROGRAM HERE
 */
import java.util.Scanner;


public class NewBus {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        final int SIZE = 2;
        final int REQUIREDBUS = 301;
        boolean found = false;
        int position = 0;
        int[] id = new int[SIZE];
        String[] make = new String[SIZE];
        int[] capacity = new int[SIZE];
        boolean [] automatic = new boolean [SIZE];

        for (int index = 0; index < SIZE; index++) {
            System.out.print("Bus " + (index + 1) + " id : ");
            id[index] = keyboard.nextInt();
            keyboard.nextLine();
            System.out.print("Bus " + (index + 1) + " make : ");
            make[index] = keyboard.nextLine();
            System.out.print("Bus " + (index + 1) + " capacity : ");
            capacity[index] = keyboard.nextInt();
            keyboard.nextLine();
            System.out.print("Bus " + (index + 1) + " automatic : ");
            automatic [index] = keyboard.nextBoolean();
            keyboard.nextLine();
        }//for

        System.out.println("ID\t\tMake\t\tCapacity\t\tAutomatic");
        for (int index = 0; index < SIZE; index++) {
            System.out.println(id[index] + "\t\t" + make[index] + "\t\t " + capacity[index] + "\t\t\t\t" + automatic[index]);
        }//for

        while ((!found) && (position < SIZE)) {
            if (REQUIREDBUS == id[position]) {
                found = true;
            }//if
            if (!found) {
                position++;
            }//if
        }//while

        if (found) {
            System.out.println("Found ID\tMake\t\tCapacity");
            System.out.println(id[position] + "\t\t\t" + make[position] + "\t\t\t" + capacity[position]);
        }//if
        else {
            System.out.println("Bus " + REQUIREDBUS + " not found");
        }//else

    }//main
}//class
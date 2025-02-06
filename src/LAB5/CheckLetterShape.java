package LAB5;

import java.util.Scanner;
/**
 * Program to read a single character and output if it is:
 * STRAIGHT letter, CURVED letter, MIXTURE letter
 */
public class CheckLetterShape {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
// Declare variables
        char letter;
        System.out.print("Enter an uppercase letter: ");
        letter = keyboard.nextLine().charAt(0);
        switch (letter) {
            case 'A': case 'E': case 'F': case 'H': case 'I':
            case 'K': case 'L': case 'M': case 'N': case 'T':
            case 'V': case 'W': case 'X': case 'Y': case 'Z':
                System.out.println("This is a STRAIGHT letter");
                break;
            case 'C': case 'O': case 'S':
                System.out.println("This is a CURVED letter");
                break;
            case 'B': case 'D': case 'G': case 'J': case 'P':
            case 'Q': case 'R': case 'U':
                System.out.println("This is a MIXTURE letter");
                break;
            default:
                System.out.println("This not an UPPERCASE letter");
        }//switch
    }//main
}//class
package LAB7;

/**
 * Created by:
 * Created on:
 * Program to print out the 3 x 4 table of Xs
 */

public class NestedForX {
    public static void main(String[] args) {

        for (int row = 1; row <= 3; row++) {
            for (int column = 1; column <= 4; column++) {
                System.out.print("\tX");
            }//for
            System.out.println();
        }//for

    }//main
}//class
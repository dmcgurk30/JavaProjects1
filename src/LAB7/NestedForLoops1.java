package LAB7;

/**
 * Created by:
 * Created on:
 * Program to demonstrate the use of nested loops
 */

public class NestedForLoops1 {
    public static void main(String[] args) {

        final int MAX = 5;

        for (int count = 1; count <= MAX; count++) {
            for (int loop = 1; loop <= count; loop++) {
                System.out.print(loop + "\t");
            }//for
            System.out.println();
        }//for

    }//main
}
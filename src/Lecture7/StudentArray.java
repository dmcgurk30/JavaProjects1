package Lecture7;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Created by:
 * Created on:
 * Define a Student Class
 */
public class StudentArray {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Declare an array capable of holding 6 student objects
        final int SIZE = 6;
        Student[] myStudents = new Student[SIZE];

        String name;
        int firstMark, secondMark, thirdMark;

        // Create 6 new Student objects
        for (int count = 0; count < SIZE; count++) {

            // Prompt for and read in the student name
            System.out.print("Enter student name: ");
            name = keyboard.nextLine();

            // Create a new instance of a Student object
            myStudents[count] = new Student(name);
        } // for

        // Prompt for and read in marks for student at index 2
        System.out.print("Enter first mark for " + myStudents[2].getName() + ": ");
        firstMark = keyboard.nextInt();
        System.out.print("Enter second mark for " + myStudents[2].getName() + ": ");
        secondMark = keyboard.nextInt();
        System.out.print("Enter third mark for " + myStudents[2].getName() + ": ");
        thirdMark = keyboard.nextInt();

        // Assign marks to student at index 2
        myStudents[2].setMarks(firstMark, secondMark, thirdMark);

        // Output details of all students
        for (int count = 0; count < SIZE; count++) {
            myStudents[count].printAllDetails();
        } // for
    } // main
} // class
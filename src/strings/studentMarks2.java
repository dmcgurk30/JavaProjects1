package strings;

import java.util.Scanner;

    /**
     * Created by:
     * Created on:
     * Program to read in a student's marks and output their grade
     */

    public class studentMarks2 {

        static Scanner keyboard = new Scanner(System.in);

        // Method to read in and return the name
        public static String enterName() {
            System.out.print("Please enter the student's name: ");
            return keyboard.nextLine();
        }//enterName

        // Method to read in and return a mark
        public static double enterMark(String marktype) {
            System.out.println();
            System.out.print("Please enter the " + marktype + " mark: ");
            return keyboard.nextDouble();
        }//enterMark

        // Method to check if a mark is in the range 0..100
        public static boolean checkMark(double mark) {
            return ((mark >= 0) && (mark <= 100));
        }//checkMark

        // Method to calculate and return the overall mark
        public static double calculateMark(double cwMark, double exMark) {
            return Math.round((cwMark + exMark) / 2);
        }//calculateMark

        // Method to assign and return the overall grade
        public static String assignGrade(double cwMark, double exMark,
                                         double finalMark) {
            final int PASS = 40;
            final int DISTINCTION = 70;

            if ((cwMark < PASS) || (exMark < PASS)) {
                return "Fail";
            }//if
            else {
                if (finalMark < DISTINCTION) {
                    return "Pass";
                }//if
                else {
                    return "Distinction";
                }//else
            }//else
        }//assignGrade

        // Method to output the results
        public static void outputResults(String pname, double pcourseworkMark,
                                         double pexamMark, double pmoduleMark) {
            System.out.println();
            System.out.println("Name \t\t\t\tCoursework \t\tExamination \tOverall \tGrade");
            System.out.println(pname + "\t\t" + (int) pcourseworkMark + "\t\t\t\t"
                    + (int) pexamMark + "\t\t\t\t" + (int) pmoduleMark + "\t\t\t" +
                    assignGrade(pcourseworkMark, pexamMark, pmoduleMark));
        }//outputResults

        public static void main(String[] args) {
            String name;
            double courseworkMark, examMark, moduleMark;
            boolean courseworkMarkOK, examMarkOK;

            name = enterName();
            courseworkMark = enterMark("coursework");
            courseworkMarkOK = checkMark(courseworkMark);
            if (courseworkMarkOK) {
                examMark = enterMark("exam");
                examMarkOK = checkMark(examMark);
                if (examMarkOK) {
                    moduleMark = calculateMark(courseworkMark, examMark);
                    outputResults(name, courseworkMark, examMark, moduleMark);
                }//if
                else {
                    System.out.println("Exam mark out of range");
                }//else
            }//if
            else {
                System.out.println("Coursework mark out of range");
            }//else
        }//main
    }//class

package TestPrac;

public class sampleTest {

        public static void printGrade(double score) {

            if (score >= 40) {

                System.out.println("Pass");

            }//if

            else {

                System.out.println("Fail");

            }//else

        }//printGrade

        public static void main (String [] args) {

           System.out.print("The grade is ");
           printGrade(65.5);

        }//main

    }//class


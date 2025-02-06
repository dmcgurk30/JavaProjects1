package Lab6_Prac;

public class oddNumbersPrac {

    public static void main(String[] args) {

        double average;
        int total = 0;
        int noOfOdd = 0;

        for (int number = 1; number <= 50; number++) {
            if (number % 2 != 0) {
                System.out.println(number);
                noOfOdd++;
                total = total + number;
            }
            average = (double) total / noOfOdd;
            System.out.println("The total of these numbers is : " + total);
            System.out.println("the average of these numbers is : " + average);
        }
    }
}

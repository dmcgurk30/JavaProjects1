package Lecture7;

/**
 * Created by:
 * Created on:
 * Program to test the Membership and Member Class
 */
public class TestClub {
    public static void main(String[] args) {
        Membership hockey = new Membership("Coleraine Hockey Club", 3);
        System.out.println(hockey);

        Membership rugby = new Membership("Ballymoney Rugby Club", 4);
        System.out.println(rugby);
    } // main
} // class


package Lecture7;

import java.util.Scanner;

/**
 * Created by:
 * Created on:
 * Defines a class to store details of the membership list
 */
public class Membership {
    Scanner keyboard = new Scanner(System.in);

    private String clubName;
    private int noOfMembers;
    private Member[] memberList;

    public Membership(String theClubName, int theNoOfMembers) {
        int id;
        String name;

        clubName = theClubName;
        noOfMembers = theNoOfMembers;
        memberList = new Member[noOfMembers];

        // Output heading
        System.out.println("\n" + clubName);
        for (int count = 0; count < clubName.length(); count++) {
            System.out.print("=");
        } // for
        System.out.println();

        // Read membership details from the keyboard
        for (int count = 0; count < noOfMembers; count++) {
            System.out.print("Enter the member's 5-digit unique id: ");
            id = keyboard.nextInt();
            keyboard.nextLine();
            System.out.print("Enter the member's name: ");
            name = keyboard.nextLine();
            memberList[count] = new Member(id, name);
        } // for
    } // Constructor

    public String toString() {
        String listOfMembers;
        listOfMembers = "\n" + clubName.toUpperCase() +
                "\nMember ID\tName\n";
        for (int count = 0; count < noOfMembers; count++) {
            listOfMembers = listOfMembers + memberList[count].toString();
        } // for
        return listOfMembers;
    } // toString
} // class
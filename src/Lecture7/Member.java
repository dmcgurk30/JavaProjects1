package Lecture7;

/**
 * Created by:
 * Created on:
 * Program to define an individual Member Class
 */
public class Member {
    // Define instance variables
    private int memberNumber;
    private String memberName;

    public Member(int number, String name) {
        memberNumber = number;
        memberName = name;
    } // Constructor

    public String toString() {
        return (memberNumber + "\t\t" + memberName + "\n");
    } // toString
} // class


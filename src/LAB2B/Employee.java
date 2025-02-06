package LAB2B;
/*
 * Program to define an Employee Class
 */

public class Employee {
    private String number;
    private String name;

    public Employee(String empNumber, String empName) {
        number = empNumber;
        name = empName;
    }//Constructor

    protected void setName(String empName) {
        name = empName;
    }//setName

    protected String getNumber() {
        return number;
    }//getNumber

    protected String getName() {
        return name;
    }//getName

    protected void welcome(){
        System.out.println("Welcome to Employee Class");
    }//welcome

    public String toString() {
        return ("Employee " + number + " is called " +
                name + "\n");
    }//toString




}//class

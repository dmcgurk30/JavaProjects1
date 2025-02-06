package Lecture2;

public class Employee {

    private String number;
    private String name;

    public Employee (String empNumber, String empName) {
        number =empNumber;
        name = empName;
    }//Constuctor

    protected void setName (String empName){
        name = empName;
    }//setName

    protected String getNumber() {
        return number;
    }//getNumber

    protected String getName() {
        return name;
    }// getName
}//class

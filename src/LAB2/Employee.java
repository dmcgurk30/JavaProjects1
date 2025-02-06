package LAB2;

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

}//class

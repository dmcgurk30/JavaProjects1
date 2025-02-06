package LAB2;

/*
 * Define a Full Time Employee Class (extends Employee)
 */

public class FullTimeEmployee extends Employee {

   private double annualSalary;

   public FullTimeEmployee(String empNumber, String empName) {
      super(empNumber, empName);
   }//Constructor

   protected void setAnnualSalary(double empSalary) {
      annualSalary = empSalary;
   }//setAnnualSalary

   protected double getAnnualSalary() {
      return annualSalary;
   }//getAnnualSalary

   protected double calculateMonthlyPay() {
      return annualSalary / 12;
   }//calculateMonthlyPay

}//class

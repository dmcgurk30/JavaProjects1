package LAB2B;

import java.text.DecimalFormat;


/*
 * Define a Full Time Employee Class (extends Employee)
 */

public class FullTimeEmployee extends Employee {
    DecimalFormat df = new DecimalFormat("#0.00");

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

    protected void welcome() {
        System.out.println("Welcome to Full Time Employee Class");
    }

//   public String toString() {
//      return ("Employee   :" + getNumber() + "\nMonthly Pay: £" + df.format(calculateMonthlyPay()) + "\n");
//   }//toString

    public String toString(){
        return (super.toString() + "Monthly Pay: £" +	df.format(calculateMonthlyPay()) + "\n");
    }//toString

}//class

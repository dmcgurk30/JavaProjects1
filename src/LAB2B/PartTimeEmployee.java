package LAB2B;

/*
 * Define a Part Time Employee Class (extends Employee)
 */

public class PartTimeEmployee extends Employee {
    private int hoursPerMonth;
    private double hourlyPay;

    public PartTimeEmployee(String pnumber, String pname) {
        super(pnumber, pname);
    }//Constructor

    public PartTimeEmployee(String pnumber, String pname, int phoursPerMonth, double phourlyPay) {
        super(pnumber, pname);
        hoursPerMonth = phoursPerMonth;
        hourlyPay = phourlyPay;
    }

    protected void setHourlyPay(double phourlyPay) {
        hourlyPay = phourlyPay;
    }//setHourlyPay

    protected double getHourlyPay() {
        return hourlyPay;
    }//getHourlyPay

    protected void setHoursPerMonth(int phoursPerMonth) {
        hoursPerMonth = phoursPerMonth;
    }//setHoursPerMonth

    protected double getHoursPerMonth() {
        return hoursPerMonth;
    }//getHoursPerMonth

    protected double calculateMonthlyPay() {
        return hoursPerMonth * hourlyPay;
    }//calculateWeeklyPay

    protected void welcome(){
        System.out.println("Welcome to Employee Class");
    }//welcome


}//class
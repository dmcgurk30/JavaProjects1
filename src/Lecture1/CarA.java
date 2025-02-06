package Lecture1;

    /**
     * Created by: Your name
     * Date: Creation Date
     * Define a Car Class
     */

    public class CarA {
        private String colour;
        private String regNumber;
        private int noOfDoors;
        private boolean hasACD;

        public CarA() {
        } // Default constructor

        public CarA(String reg, int doors) {
            regNumber = reg;
            noOfDoors = doors;
        } // Alternative Constructor

        public CarA(String reg, int doors, String carColour) {
            regNumber = reg;
            noOfDoors = doors;
            colour = carColour;
            hasACD = false;
        } // Alternative constructor

        public CarA(String carColour, String reg) {
            colour = carColour;
            regNumber = reg;
            noOfDoors = 4; // A possible suitable default value?
            hasACD = false; // A possible suitable default value?
        } // Alternative Constructor

        public CarA(int doors, String reg) {
            noOfDoors = doors;
            regNumber = reg;
            colour = "unknown"; // A possible suitable default value?
            hasACD = true; // A possible suitable default value?
        } // Alternative Constructor

        public CarA(String carColour, String reg, int doors, boolean cd) {
            colour = carColour;
            regNumber = reg;
            noOfDoors = doors;
            hasACD = cd;
        } // Alternative Constructor

    public void setColour(String carColour) {
        colour = carColour;
    } // setColour

    public void setRegNumber(String reg) {
        regNumber = reg;
    } // setRegNumber

    public void setNoOfDoors(int doors) {
        noOfDoors = doors;
    } // setNoOfDoors

    public void setHasACD(boolean cd) {
        hasACD = cd;
    } // setHasACD

    public String getColour() {
        return colour;
    } // getColour

    public String getRegNumber() {
        return regNumber;
    } // getRegNumber

    public int getNoOfDoors() {
        return noOfDoors;
    } // getNoOfDoors

    public boolean getHasACD() {
        return hasACD;
    } // getHasACD

    // Method to print out all the details of a Car
    public void printCarDetails() {
        System.out.println("CAR DETAILS");
        System.out.println("The registration of the car is " + regNumber);
        System.out.println("The colour of the car is " + colour);
        System.out.println("The car has " + noOfDoors + " doors");
        if (hasACD) {
            System.out.println("The car has a CD");
        } // if
        else {
            System.out.println("The car does not have a CD");
        } // else
        System.out.println("===========");
    } // printCarDetails

} // class

package Lecture1;

    /**
     * Created by: Your name
     * Date: Creation Date
     * Program to test the Car class
     */

    public class TestCarA {
        public static void main(String[] args) {
            CarA myCar;
            myCar = new CarA();
            myCar.printCarDetails();

            CarA someCar = new CarA();
            someCar.printCarDetails();

            CarA herCar = new CarA("MIA 10", 3);
            herCar.printCarDetails();

            CarA hisCar = new CarA("HDZ 3434", 4, "blue");
            hisCar.printCarDetails();

            CarA janeCar = new CarA("blue", "MNZ 6700");
            janeCar.printCarDetails();

            CarA johnCar = new CarA(3, "PSR 811H");
            johnCar.printCarDetails();

            CarA completeCar = new CarA("yellow", "VIA 4091", 5, false);
            completeCar.printCarDetails();

            // Use of get methods
            System.out.println("Colour of car " + herCar.getRegNumber() + " is "
                    + herCar.getColour());
            System.out.println(johnCar.getRegNumber() + " has " +
                    johnCar.getNoOfDoors() + " doors" + "\n");

            // Use of set methods
            janeCar.setColour("Green");
            System.out.println("Colour of " + janeCar.getRegNumber() + " is now "
                    + janeCar.getColour() + "\n");

            myCar.setColour("Blue");
            myCar.setRegNumber("BWF 2341");
            myCar.setNoOfDoors(4);
            myCar.setHasACD(false);
            myCar.printCarDetails();

        } // main
    } // class
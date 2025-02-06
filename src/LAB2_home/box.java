package LAB2_home;

/**
     * Created by:
     * Created on:
     * Program to print out the volume and perimeter of a box
     */
        public class box {
        public static void main(String[] args) {
            int height = 2, width = 3, depth = 4;
            int volume, perimeter;
// Calculate volume
            volume = height * width * depth;
// Calculate perimeter
            perimeter = (4 * height) + (4 * width) + (4 * depth);
// Print out the height, width and depth
            System.out.println("The box is " + height + "cm high, " + width
                    + "cm wide and " + depth + "cm deep");
            // Print out volume
            System.out.println("The volume of the box is " + volume + " cms cubed");
// Print out perimeter
                    System.out.println("The perimeter of the box is " + perimeter +
                            " cms");
        }//main
    }//class

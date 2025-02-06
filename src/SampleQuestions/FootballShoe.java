package SampleQuestions;

/**
 * Created by User1
 * COMMENTS ABOUT PROGRAM HERE
 */
public class FootballShoe extends Shoe {
    private String make;//two instance variables
    private String colour;

    public FootballShoe(int shoeSize, String sMake) {//constructor
        super(shoeSize);
        make = sMake;// the second to initialise make
    }
    protected void setColour(String sColour){//method to set colour, which accepts a String parameter
        colour = sColour;
    }
    protected String getColour(){
        return colour;
    }
    public String toString(){//super to make use of toString() in the shoe class - returns all three details
        return super.toString() + " and its make is " + make + " and its colour is " + colour;
    }
}//class

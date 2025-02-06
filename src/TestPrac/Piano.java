package TestPrac;

public class Piano {

    private int noOfKeys;

    private String pianoType;

    public Piano(){
    }

    public Piano(int itsKey, String type) {
        noOfKeys = itsKey;
        pianoType = type;
    }
    public String toString(){
        return "Piano has " + noOfKeys + " keys and is a " + pianoType;
    }
}

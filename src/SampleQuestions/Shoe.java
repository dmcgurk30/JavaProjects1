package SampleQuestions;

    /**
     * Created by User1
     * COMMENTS ABOUT PROGRAM HERE
     */
    public class Shoe {
        private int shoeSize;//instance variable

        public Shoe(){//default constructor
        }

        public Shoe(int sSize){//user defined constructor where size is passed as a parameter
            shoeSize = sSize;
        }

        public String toString(){//toString method to return the size of the shoe
            return "Size of shoe is " + shoeSize;
        }

    }//class
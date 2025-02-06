package SampleQuestions;

    /**
     * Created by User1
     * COMMENTS ABOUT PROGRAM HERE
     */
    public class BuildPC {
        public static void main(String[] args) {
            PersonalComputer pc = new PersonalComputer(9);// create instance with memory size
            pc.setProcessorType("intel i9");//set processor type
            System.out.println(pc.getMemorySize());//print out memory size
            System.out.println(pc.getProcessorType());//print out processor type

        }//main
    }//class

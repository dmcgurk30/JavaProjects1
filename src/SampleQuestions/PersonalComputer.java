package SampleQuestions;

    /**
     * Created by User1
     * COMMENTS ABOUT PROGRAM HERE
     */

    public class PersonalComputer {
        private int memorySize;
        private String processorType;

        public PersonalComputer(int memory){//user defined constructor - assign value to memory size
            memorySize = memory;
        }

        protected int getMemorySize(){ //accessor method
            return memorySize;
        }

        protected void setProcessorType(String processor){// mutator method
            processorType = processor;
        }
        protected String getProcessorType(){
            return processorType;
        }
    }//class

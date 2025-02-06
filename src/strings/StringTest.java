package strings;

    /**
     * Created by Rosaleen
     * COMMENTS ABOUT PROGRAM HERE
     */
    public class StringTest {
        public static void main(String[] args) {
            String myString = "abcDEFMNopqrstYZ";
            String message = "HELLO you!";
            char letter1, letter2, letter3;
            int result;
            String yourString, newString;
            boolean same;


            // Returns the length of the string i.e. the number of characters in the String.
            result = myString.length();
            System.out.println("result: " + result);
            System.out.println();


            //Returns the character found at the specified index (or location within the String).
            letter2 = myString.charAt(2);
            System.out.println("letter2: " + letter2);
            System.out.println();


            //Converts the supplied String to UPPERCASE
            myString = myString.toUpperCase();
            System.out.println("myString: " + myString);
            System.out.println();

            //Returns the character found at the specified index (or location within the String).
            letter1 = myString.charAt(2);
            System.out.println("letter1: " + letter1);
            System.out.println();

            //Returns the character found at the specified index (or location within the String).
            letter2 = myString.charAt(13);
            System.out.println("letter2: " + letter2);
            System.out.println();


            //Returns a new String that is a substring made up of the
            //characters in the locations starting at begin index through
            //to (end  - 1) index of the String supplied.
            yourString = myString.substring(2, 9);
            System.out.println("yourString: " + yourString);
            System.out.println();


            //Returns the character found at the specified index (or location within the String).
            letter3 = myString.charAt(0);
            System.out.println("letter3: " + letter3);
            System.out.println();

            //Returns a new String that is a substring made up of the
            //characters in the locations starting at begin index through
            //to the end of the String.
            myString = yourString.substring(5);
            System.out.println("myString: " + myString);
            System.out.println();



            myString = "abcDEFMNopqrstYZ$%&";
            message = "HELLO you!";
            int size = message.length();
            System.out.println("size: " + size);
            System.out.println();


            letter1 = myString.charAt(4);
            System.out.println("letter1: " + letter1);
            System.out.println();


            letter2 = message.charAt(6);
            System.out.println("letter2: " + letter2);
            System.out.println();


            //Compares two Strings on a character by character basis
            //to see if the are the same.
            same = myString.equals(message);
            System.out.println("same: " + same);
            System.out.println();



            //Compares two Strings on a character by character basis
            //to see if they contain the same characters (regardless of
            //case).
            same = myString.equalsIgnoreCase(message);
            System.out.println("same: " +same);
            System.out.println();


            //Converts the supplied String to lowercase.
            same = message.equalsIgnoreCase("hello you!");
            System.out.println("same: " + same);
            System.out.println();



            newString = myString.toLowerCase();
            System.out.println("newString: " + newString);
            System.out.println();


            String lower = message.toLowerCase();
            System.out.println("lower: " + lower);
            System.out.println();


            newString = myString.toUpperCase( );
            System.out.println("newString: " + newString);
            System.out.println();


            //Returns a new String formed by replacing all
            //occurrences of the first character (x) supplied in the
            //String with the second character (y) supplied.
            newString = message.replace('L', '*');
            System.out.println("newString: " + newString);
            System.out.println();


            message = message.replace('L', '*');
            System.out.println("message: " + message);
            System.out.println();


            String name = " John ";
            System.out.println(name);
            System.out.println();


            //Removes spaces from both ends of this string.
            String newName = name.trim();
            System.out.println(newName);
            System.out.println();


            String aSubString = myString.substring(3,12);
            System.out.println("aSubString: " + aSubString);
            System.out.println();

            String start = message.substring(0,5);
            System.out.println("start: " + start);
            System.out.println();


            String bSubString = message.substring (4);
            System.out.println(bSubString);
            System.out.println();



            String finish = message.substring(6);
            System.out.println(finish);
            System.out.println();


            String newmessage = message.concat("!!!");
            System.out.println(newmessage);
            System.out.println();



            name = "John";
            name = name.concat(" Smith");
            System.out.println(name);
        }//main
    }//class

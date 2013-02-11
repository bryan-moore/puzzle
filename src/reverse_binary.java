/**
 * @author bryan moore
 * date: 2/11/13
 */

import java.io.*;
import static java.lang.Integer.*;

public class reverse_binary {

    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String s;

        while ((s = read.readLine()) != null && s.length() != 0){

            int intToConvert = Integer.parseInt(s);

            if(intToConvert > 0 || intToConvert < 1000000000) { //int is within range

                String intConverted = toBinaryString(intToConvert); //convert input to binary
                char[] myArray = intConverted.toCharArray(); //convert binary to char array

                reverseMyArray(myArray); //reverse elements in array
                String newBinary = new String(myArray);

                int newInt = Integer.parseInt(newBinary,2); //convert back to integer
                System.out.println(newInt);
            }
            else
                System.out.println("Invalid integer.");
        }
    }

    public static void reverseMyArray(char[] array) {
        // Takes a char array as input, then
        // using indexes at opposite ends, switches
        // values until the i & j meet in the middle
        // of the array.
        if (array == null) {
            return;
        }

        int i = 0;
        int j = array.length - 1;
        char tmp;

        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
    }
}

/**
 * @author bryan moore
 * date: 2/11/13
 */

import java.util.Scanner;
import static java.lang.Integer.*;

public class reverse_binary {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please input your number:");
        int intToConvert = scan.nextInt();

        String intConverted = toBinaryString(intToConvert); //convert input to binary
        char[] myArray = intConverted.toCharArray(); //convert binary to char array

        reverseMyArray(myArray); //reverse elements in array
        String newBinary = new String(myArray);

        int newInt = Integer.parseInt(newBinary,2); //convert back to integer
        System.out.println(newInt);
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

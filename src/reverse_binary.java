/**
 * @author bryan
 * date: 2/10/13
 */

import java.util.Scanner;
import static java.lang.Integer.toBinaryString;

public class reverse_binary {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please input your number:");

        int intToConvert = scan.nextInt();
        String intConverted = toBinaryString(intToConvert);
        char[] arr = intConverted.toCharArray();
        boolean[] binaryarray = new boolean[intConverted.length()];

        for(int i; i<intConverted.length();i++){
            if (arr[i] == '1'){
                binaryarray[i] = true;
            }
            else if (arr[i] == '0'){
                binaryarray[i] = false;
            }
        }


        System.out.println("You entered:" + intConverted);
    }

    public printFromArrat(String) {

    }

}

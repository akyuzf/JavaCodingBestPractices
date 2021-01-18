package Part1;

/*
The code provided in your main method will take in five Strings and save them into an array called arr.  Print out the first three letter of each element of arr, one per line.  You can assume that every element of arr is at least 3 letters long.

Example:
arr -> ["apple", "banana"]
 prints: app
         ban
 */
import java.util.Scanner;

public class A109_ArraysPrinting01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextLine();
        }

        //leave above alone!  write your code below
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j].substring(0, 3));
        }
/*
	  for ( String each : arr ) {
            System.out.println(""+ each.charAt(0)+each.charAt(1)+each.charAt(2));
        }
 */

    }
}

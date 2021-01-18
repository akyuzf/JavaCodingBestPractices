package Part1;

/*
Print out the number of times that the string "hi" appears anywhere in the given string.
Example:
input: abc hi how hi
output: 2

Example:
input: hi code java please
output: 1
 */
import java.util.Scanner;

public class A91_CountHi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int count = 0;

        while (str.contains("hi")) {
            count++;
            str = str.replaceFirst("hi", " ");
        }
        System.out.println(count);

/*

        for(int i = 0; i < str.length()-1; i++)
        {
            if(str.charAt(i) == 'h' && str.charAt(i+1) == 'i')
                count++;
        }
        System.out.println(count);

 */


    }
}

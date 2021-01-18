package Part1;

/*
Given a String array words, iterate through each word and print first and last letter of each element in the format below.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print → [ho, wy, by, ae, ne]
 */
import java.util.Arrays;
import java.util.Scanner;

public class A105_ArraysPrintFirstLast {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};

        for (int i = 0; i < words.length; i++) {
            words[i] = "" + words[i].charAt(0) + words[i].charAt(words[i].length() - 1);
        }

        System.out.print(Arrays.toString(words));

    }

}

package Part1;

/*
Given the array words, it will print the word with the largest length. Assume that there are no 2 words with longest length

Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa
 */
import java.util.Scanner;

public class A115_ArraysFindingMaxlength {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {
            words[i] = input.nextLine();
        }

        //write your code below

        String result = "";

        for (int i=0; i<words.length; i++) {
            if (result.length() < words[i].length()) {
                result = words[i];
            }
        }

        System.out.println(result);

/*

		String longestWord = "";
        for (int i = 0; i <words.length ; i++) {

                for (int j = 0; j < words.length; j++) {
                    if ( words[i].length() > words[j].length() ) {
                        longestWord = words[i];
                    }
                }
        }
        System.out.println(longestWord);

 */


    }

}

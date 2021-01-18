package Part1;

/*
Given a String variable sentence, write code to type each word in separate lines.

Example:
sentence -> "Java is fun"
Print
Java
is
fun
 */

import java.util.Scanner;

public class A106_SplitSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //type your code below
        String Sntnc[] = sentence.split(" ");

        for (int i=0; i<Sntnc.length ; i++){
            System.out.println(Sntnc[i]);
        }

    }

}
package Part1;

/*
Write a program that will print out last letter of the word (string).
 */
import java.util.Scanner;

public class A60_PrintLast {

    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        String last=word.substring(word.length()-1);
        System.out.println(last);
    }

}

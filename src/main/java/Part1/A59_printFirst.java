package Part1;

/*
Write a program that will print out first character of the word.

 */
import java.util.Scanner;

public class A59_printFirst {

    public static void main(String[] args) {

        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        String firstCharacter = word.substring(0,1);
        System.out.println(firstCharacter);

    }

}

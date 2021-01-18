package Part1;

/*
Assume that word is a String variable and already has a value.
Write a statement to display the message "Today's Word-Of-The-Day is: " followed by the value of word.
The message and the value of word should appear together, on  a single line.

Ex:

Today's Word-Of-The-Day is:Java

 */
import java.util.Scanner;

public class A13_PrintVariable4 {

    public static void main(String[] args) {
        //Do not change
        String word = new Scanner(System.in).nextLine();

        //Write Your code here

        System.out.println("Today's Word-Of-The-Day is:"+word);


    }

}

package Part1;

/*
first and second are already declared and given values.
Write a single statement that will print the message "first is " followed by the value of first, and then a space, followed by "second = ", followed by the value of second.

Ex:

first is 55 second = 123
 */
import java.util.Scanner;

public class A14_PrintVariable5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        int second = scan.nextInt();

        System.out.println("first is "+first+" second = "+second);


    }
}

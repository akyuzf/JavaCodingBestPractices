package Part1;

/*
Write a program that will output length of the text (string).

Example:
Display message: "Please enter the text:"
input: java
Display message: "Length is: 4"

 */
import java.util.Scanner;

public class A58_FindLength {

    public static void main(String[] args) {
        //WRITER YOU CODE HERE

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the text:");
        String text = scan.nextLine();
        System.out.println("Length is: "+text.length());



    }
}

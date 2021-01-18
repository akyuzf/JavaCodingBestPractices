package Part1;

/*
write a program that asks the user for his first name and last name.

use a scanner to get the use input.
 */
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        System.out.println(firstName);
        System.out.println(lastName);

    }
}

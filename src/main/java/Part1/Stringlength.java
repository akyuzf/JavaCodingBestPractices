package Part1;

/*
ask the user for his name, capture it on a string using scanner.

then output the length of the name string.
 */
import java.util.Scanner;

public class Stringlength {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.next();

        System.out.println(name.length());
    }
}

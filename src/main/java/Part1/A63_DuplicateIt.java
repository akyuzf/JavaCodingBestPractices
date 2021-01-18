package Part1;

/*
You have 2 words
Print the first word, second word, second word, first word

Input:
one
two
Output:
onetwotwoone
 */
import java.util.Scanner;

public class A63_DuplicateIt {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE
        System.out.println(word1+word2+word2+word1);

    }
}

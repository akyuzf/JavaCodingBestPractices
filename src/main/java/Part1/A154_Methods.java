package Part1;

/*
Complete a method isPalindrome() that will check if number is a palindrome. Print your result as a boolean (true or false).
Example:
input: 1001
output: true

Example:
input: 1234
output: false
 */
import java.util.Scanner;

public class A154_Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num) {
        //WRITE YOUR CODE HERE
        String str = "" + num;
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

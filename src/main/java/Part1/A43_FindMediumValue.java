package Part1;

/*
Write a program that will return mid number out of three numbers.  No need to do any calculations.


Example 1:
Display prompt: "Enter first number:"
14
Display prompt: "Enter second number:"
52
Display prompt: "Enter third number:"
25
Display prompt: "Medium value is: 25"

Example 2:
Display prompt: "Enter first number:"
140
Display prompt: "Enter second number:"
34
Display prompt: "Enter third number:"
1
Display prompt: "Medium value is: 34"
 */
import java.util.Scanner;

public class A43_FindMediumValue {

    public static void main(String[] args) {
        // DO NOT CHANGE:
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = input.nextInt();
        System.out.println("Enter second number:");
        int num2 = input.nextInt();
        System.out.println("Enter third number:");
        int num3 = input.nextInt();

        //WRITE YOUR CODE HERE

        if (num1 > num2 && num2 < num3) {
            System.out.println("Medium value is: " + num1);
        } else if (num2 > num1 && num2 < num3) {
            System.out.println("Medium value is: " + num2);
        } else if (num3 > num1 && num3 < num2) {
            System.out.println("Medium value is: " + num3);
        } else {
            System.out.println("Medium value is: " + num2);
        }

    }

}

package Part1;

/*
Write a program that determines the change to be dispensed from a vending
machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
dollar bill to pay for the item.

- int variable itemPrice
- int variables quarters, dimes, nickels
- Scanner object

Program accepts itemPrice, which is a price for the item you would like to purchase.

Positive behaviour:

Please follow the example in the image. dots mean empty space.
-Since the item price was entered 95, change is 1 nickels

Negative behaviour:

If itemPrice is less than 25 or more than 100 cents, then display error message:
Invalid price!

If itemPrice is not divisible by 5, then also display error message:
Invalid price!

use (itemPrice % 5 == 0) expression to find it is divisible by 5.

Do not display anything else.

 */
import java.util.Scanner;

public class A34_VendingMachine {

    public static void main(String[] args) {
        //ENTER CODE HERE
        Scanner s = new Scanner(System.in);
        System.out.println("Enter price in cents:");
        int itemPrice = s.nextInt();
        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int remainder = 100 - itemPrice;

        boolean condition = (itemPrice >= 25 && itemPrice <= 100) && (itemPrice % 5 == 0);
        if (condition) {
            int quarters = remainder / quarter;
            int dimes = (remainder % quarter) / dime;
            int nickels = ((remainder % quarter) % dime) / nickel;
            System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");

        } else {
            System.out.println("Invalid price!");
        }
    }

}

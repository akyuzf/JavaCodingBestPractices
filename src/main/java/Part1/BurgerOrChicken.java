package Part1;

/*
a fast food company has two main order types, burger meal and chicken meal.
both have the same prices.
so if a cashier enters "burger" or "chicken " he will get the same price

a float : 10.0

this test can be done with one if.

check if in (string variable) equals "burger" or "chicken"  and output the price 10.0

also if input is "soda" output 2.0 (do this with another if)

for example:

in = "burger"

output: 10.0

in = "chicken "

output: 10.0

in = "soda"

output: 2.0

hint or operator in java is  ||

 */
import java.util.Scanner;

public class BurgerOrChicken {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String in = scan.next();

        //your code here
        float burger = 10.0f;
        float chicken = 10.0f;
        float soda = 2.0f;

        if (in.equals("burger") || in.equals("chicken")) {
            System.out.println(10.0);
        }

        if (in.equals("soda")) {
            System.out.println(2.0);
        }

    }

}

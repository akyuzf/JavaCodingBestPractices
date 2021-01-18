package Part1;

import java.util.Scanner;

/*
SDET Motors Inc. is recalling all vehicles from model years 1995-1998,  2001-2002,  2004-2006 and 2015-2017.

In this assignment you will write a program that will find vehicle for recall.

-Display prompt: "Enter vehicle's year:"
input: 1996

 if the value of modelYear does fall within the four recall ranges, display output:
"Your vehicle needs to be recalled!"

Otherwise, display message:
"Your vehicle is fine, enjoy!"
 */
public class A42_VehicleRecall {

    public static void main(String[] args) {

        // DO NOT CHANGE:
        Scanner input = new Scanner(System.in);
        System.out.println("Enter vehicle's year:");
        int vehicleYear = input.nextInt();

        //WRITE YOUR CODE HERE:
        if (1995 <= vehicleYear && vehicleYear <= 1998 || 2001 <= vehicleYear && vehicleYear <= 2002 ||
                2004 <= vehicleYear && vehicleYear <= 2006 || 2015 <= vehicleYear && vehicleYear <= 2017) {
            System.out.println("Your vehicle needs to be recalled!");
        } else {
            System.out.println("Your vehicle is fine, enjoy!");
        }

    }

}

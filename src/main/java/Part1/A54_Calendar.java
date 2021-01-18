package Part1;

/*
Write a program that will print out month name by receiving a number. Use switch statement for conditions.

Example:
Display message: "Enter month number:"
input: 5
Display message: "May"
 */
import java.util.Scanner;

public class A54_Calendar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter month number:");
        int num = input.nextInt();
        String month = "";

        switch (num) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;

            default:
                month = "Invalid number!";
        }
        System.out.println(month);

    }

}

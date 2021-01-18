package Part1;

/*
Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
Ask for the first guest name.
Then ask does user want to enter one more guest.
 If yes - take input from.
If not - finish the program and print list of the guests.

Example of the program:

Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no

Guest's list: Nick, Linda
 */
import java.util.Scanner;

public class A83_Party {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String totalList = " ";

        // your code
        while (true) {
            System.out.println("Please enter guest name:");
            String guestName = input.next();
            totalList += guestName + ", ";

            System.out.println("Do you want to enter new guest name:");
            String answer = input.next();
            if (answer.equals("no")) {
                System.out.println("Guest's list:" + totalList.substring(0, totalList.length() - 2));
                break;
            }

        }


/*
 System.out.println("Please enter guest name:");
        String str = input.next();
        String guestList = str;
         while (true) {

            System.out.println("Do you want to enter new guest name:");
            String answer = input.next();
                    if (answer.equalsIgnoreCase("yes")){
                        System.out.println("Please enter guest name:");
                        String str2 = input.next();
                        guestList = guestList + ", " +str2;
                    } else if (answer.equalsIgnoreCase("no")) {
                        break;
                    }

        }
 */

    }

}

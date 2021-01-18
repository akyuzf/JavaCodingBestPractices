package Part1;

/*
In this task, you need to swap the first name with the last name in the email. If the email doesn't contain underscore - do not do anything.

Example:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com

Example:
input: barakobama@gmail.com
output: barakobama@gmail.com
 */
import java.util.Scanner;

public class A72_Email1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        if (email.contains("_")) {
            String firstName = email.substring(0, email.indexOf("_"));
            String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@"));
            System.out.println(lastName.concat("_").concat(firstName).concat(domain));
        } else {
            System.out.println(email);
        }

    }
}

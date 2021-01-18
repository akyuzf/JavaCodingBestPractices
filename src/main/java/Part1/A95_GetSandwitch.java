package Part1;

/*
A sandwich is two pieces of bread with something in between. Print the string that is between the first and last appearance of "bread" in the given string, or return string "nothing" if there are not two pieces of bread.

Example:
input: breadjambread
output: jam

Example:
input: xxbreadjambreadyy
output: jam

Example:
input: xxbreadapple
output: nothing

Example:
input: breadbutterbread
output: butter
 */
import java.util.Scanner;

public class A95_GetSandwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        int countBread = 0;
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.contains("bread")) {
                countBread++;
            }
        }

        if (countBread == 1 || countBread < 10) {
            System.out.println("nothing");
        } else if (countBread > 2) {
            System.out.println(str.substring(str.indexOf("d") + 1, str.lastIndexOf("b")));
        }

    }
}

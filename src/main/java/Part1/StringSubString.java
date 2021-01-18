package Part1;

/*
using substring method output the first two letters of text string
for examole:
String txt = "foo"
the first two letters are "fo"


use print not println.

 */
import java.util.Scanner;

public class StringSubString {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();

        //your code here
        System.out.print(txt.substring(0, 2));
    }

}

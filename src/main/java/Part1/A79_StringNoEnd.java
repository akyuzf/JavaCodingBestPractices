package Part1;

/*
In this exercise you get a string called txt .

output txt without its last letter.

for example:

txt = "foo"

output will be:
fo

 */
import java.util.Scanner;

public class A79_StringNoEnd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here

        txt = txt.substring(0, txt.length() - 1);
        System.out.println(txt);
    }

}

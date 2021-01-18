package Part1;

/*
2 String variables are already declared and assigned values.
They will hold different programming language names.

Using those variables print the message exactly like below.

Ex:
Assume lan1 = "Java" and lan2 = "SQL"

You need to print exactly:

I will learn "Java" and "SQL" at CybertekSchool.
 */
import java.util.Scanner;

public class A17_PrintVariable8 {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        Scanner scan = new Scanner(System.in);
        String lan1 = scan.nextLine();
        String lan2 = scan.nextLine();

        //WRITE YOUR CODE BELOW THIS LINE:

        System.out.println("I will learn \"" +lan1+"\" and \""+lan2+"\" at CybertekSchool." );


    }
}

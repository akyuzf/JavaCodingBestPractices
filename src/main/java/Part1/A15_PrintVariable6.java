package Part1;

/*
Given an integer variable i and a floating-point variable f, that have already been given values, write a statement that writes both of their values to console in the following format:

i=value-of-i f=value-of-f

Ex:
Assume i = 9 and f = 33.4

Output should be:
i=9 f=33.4
 */
import java.util.Scanner;

public class A15_PrintVariable6 {

    public static void main(String[] args) {
        //do not change
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        float f = scan.nextFloat();

        //write your code here

        System.out.println("i="+i+" "+"f="+f);

    }

}

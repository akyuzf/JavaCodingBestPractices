package Part1;

/*
Two variables, num and cost have been declared and given values:
num is an integer and cost is a double.
Write a single statement that prints num and cost.
Print both values (num first, then cost), separated by a space on a single line. Do not output any thing else.
 */
import java.util.Scanner;

public class A12_PrintVariable3 {

    public static void main(String[] args) {
        //do not change
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        double cost = in.nextDouble();

        //write your code here

        System.out.println(num +" "+cost);


    }

}

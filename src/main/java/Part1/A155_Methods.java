package Part1;

/*
Complete a method fib() that will compute Fibonacci numbers
In Fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144,……... The first two numbers of Fibonacci series are 0 and 1.
Given a number num, print n-th Fibonacci Number.

Input  : 2
Output : 1

Input  : 9
Output : 34
 */
import java.util.Scanner;

public class A155_Methods {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num) {


        int num1 = 0;
        int num2 = 1;
        int sum = 0;

        do {

            num1 = num2;
            num2 = sum;
            sum = num1 + num2;


            num--;

        } while (num > 0);

        System.out.print(sum);


/*
    int[] f = new int[num+2];
            f[0] = 0;
            f[1] = 1;

            for (int i = 2; i <= num ; i++) {
                f[i] = f[i-1] + f[i-2];
            }
            System.out.println(f[num]);
        }
 */


    }

}

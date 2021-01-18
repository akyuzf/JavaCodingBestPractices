package Part1;

/*
create a static method called "plus", its return is void and it gets no arguments.

It asks the user to input two numbers, then it will add them and print the result.
Create a scanner within plus method.

Example:

enter first number:
1
enter second number:
2
result: 3
 */
import java.util.Scanner;

public class A139_Method1_SimpleCalc {

    public static void plus(){
        //your code here
        Scanner scan = new Scanner(System.in);

        int first = scan.nextInt();

        int second =scan.nextInt();
        int result = first+second;
        System.out.println("result: "+result);

    }

}

package Part1;

/*
Given method called cube. Write all required code inside this method in order  to asks the user for a number and then prints the cubed value of that number:

Example:

input: 5
output: 125

hint: cube of a number n = n*n*n
 */
import java.util.Scanner;

public class A141_FindCube {

    public static void cube() {
        //your code here
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num1=input.nextInt();
        int cubeofNum=num1*num1*num1;
        System.out.println(cubeofNum);

    }//end cube

    public static void main(String[] args) {

        cube();

    }

}

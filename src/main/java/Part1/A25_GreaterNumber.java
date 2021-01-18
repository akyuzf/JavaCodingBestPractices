package Part1;

/*
using an if statement check which int is larger a or b, and then output:
"number is greater".

for example:
a=1
b=2

output:
2 is greater

a=5
b=7

output:
7 is greater

 */
import java.util.Scanner;

public class A25_GreaterNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        //WRITE YOUR CODE HERE:
        String str="";

        if(a>b){
            str=a+" is greater";
        }else{
            str=b+" is greater";
        }

        System.out.println(str);
    }
}

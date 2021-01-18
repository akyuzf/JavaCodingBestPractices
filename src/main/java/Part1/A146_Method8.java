package Part1;

/*
The method person get a string with this format : "name,last name,age"
for example:

person("jon,doe,30");

the output is:

person name: jon last name: doe age: 30

hint: use the split method to split the string to a string array where there is a "," char

 */
import java.util.Scanner;

public class A146_Method8 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s);
    }

    public static void person(String info) {

        String[] arr = info.split(",");
        System.out.println("person name: " + arr[0] + " last name: " + arr[1] + " age: " + arr[2]);

    }//end per
}

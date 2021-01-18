package Part1;

/*
Given a String variable sentence, write code to get each word and assign to String reversed in reverse order.

Example:
sentence -> "Java is fun"
reversed -> "fun is Java"
 */
import java.util.Scanner;

public class A103_ArraysReverseSentence2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String reversed = "";

        String arr[] = sentence.split(" ");
        String arr1 [] = new String [arr.length];
        for (int i= 0; i<arr1.length; i++) {
            arr1[i] = arr[arr1.length-1-i]; {
                reversed +=arr1[i]+" ";
            }
        }
        reversed = reversed.trim();

        System.out.println(reversed);

    }

}

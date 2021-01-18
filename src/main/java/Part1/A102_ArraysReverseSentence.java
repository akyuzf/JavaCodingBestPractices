package Part1;

/*
Given a String variable sentence, write code to type each word in separate lines in a reverse order.
Example:
sentence -> "Java is fun"
Print
fun
is
Java
 */
import java.util.Scanner;

public class A102_ArraysReverseSentence {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] word=sentence.split(" ");
        for(int i=word.length-1;i>=0;i--){
            System.out.println(word[i]);
        }

    }

}

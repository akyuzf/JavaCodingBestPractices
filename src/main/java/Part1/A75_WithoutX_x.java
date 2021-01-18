package Part1;

/*
Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars,  otherwise print the string unchanged.

Example:
input: xHiX
output: Hi

Example:
input: apple
output: apple

input: xUxL
output: UxL

input: JavaX
output: Java
 */
import java.util.Scanner;

public class A75_WithoutX_x {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String str = "";

        if (word.toLowerCase().startsWith("x") && word.toLowerCase().endsWith("x")) {
            str = word.substring(1, word.length() - 1);
        } else if (word.toLowerCase().startsWith("x")) {
            str = word.substring(1);
        } else if (word.toLowerCase().endsWith("x")) {
            str = word.substring(0, word.length() - 1);
        } else {
            str = word;
        }

        /*
         if (word.startsWith("x") || word.startsWith("X") || word.endsWith("x") || word.endsWith("X")){
        String word2 = word.replace("x", "");
        String word3 = word2.replace("X", "");
        System.out.println(word3);
    } else {
        System.out.println(word);
    }
         */


        System.out.println(str);
    }

}

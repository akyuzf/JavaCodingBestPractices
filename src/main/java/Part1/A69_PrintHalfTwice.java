package Part1;

/*
Write a program that will print out first half of the word twice.

Example:

input: java
output: jaja
 */
import java.util.Scanner;

public class A69_PrintHalfTwice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        if (word.length()%2!=0){
            word = word.substring(0,word.length()/2) + word.substring(0,word.length()/2);
        }else{
            word = word.substring(0,word.length()/2)+word.substring(0,word.length()/2);
        }

        System.out.println(word);


//        String word2 = word.substring(0,word.length()/2);
//        String word3 = word2.concat(word2);
//        System.out.println(word3);



    }

}

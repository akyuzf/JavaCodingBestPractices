package Part1;

/*
Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive).
Example:
input: We study java not python
output: true

Example:
input: What's the difference between java, javascript and python?
output: false
 */
import java.util.Scanner;

public class A97_EqualsJavaPython {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int countJava = 0;
        int countPython = 0;

        for (int i = 0; i <= sentence.length() - 1; i++) {
            if (sentence.contains("java")) {
                countJava++;
                sentence = sentence.replaceFirst("java", "");
            }
            if (sentence.contains("python")) {
                countPython++;
                sentence = sentence.replaceFirst("python", "");
            }
        }

        System.out.println(countJava == countPython);


/*
    int numberOfj = 0;
        int numberOfP = 0;


            while  (sentence.contains("java")) {
                sentence = sentence.replaceFirst("java", "-");
                numberOfj++;
            }
            while  (sentence.contains("python")) {
                sentence = sentence.replaceFirst("python", "-");
                numberOfP++;
            }
        if (numberOfj == numberOfP) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


 */

    }

}

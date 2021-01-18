package Part1;

/*
extractNum

description:
a method that cleans any non number string from a string it gets
and returns the clean string
input:
-s (string)- a string the method gets
return: string: a string of numbers only

example use:

extractNum("aa2aa3") ==> 23

extractNum("aa2") ==> 2

extractNum("aa10aa") ==> 10

extractNum("aa!!%$#.10aa") ==> 10
 */
public class A186_Methods {


    public static String extractNum(String s) {


        String alpha = "";
        String num = "";

        char[] c_arr = s.toCharArray();
        for (char each : c_arr) {
            if (Character.isDigit(each)) {
                num += each;
            } else {
                alpha += each;
            }
        }

        return num;

    }

}

package Part1;

/*
This method gets a string and an int, it returns a string.

what it does is limit the inputted string to a certain number of characters.

for example:

limit("abcd",2)
returns "ab"

limit("bla bla",3)
returns "bla"

hint:

https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#substring(int)

 */
public class A171_methods {
    public static String limit(String text, int maxLength) {
        String ss = "";

        for (int i = 0; i < text.length(); i++) {

            if (ss.length() < maxLength) {
                ss += text.charAt(i);
            }
        }
        return ss;

/*
 return text.substring(0,maxLength);
 */

    }
}

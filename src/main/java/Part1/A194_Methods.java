package Part1;

/*
Palindrome is a word, phrase, or sequence that reads the same backward as forward, e.g., madam or nurses run.

So method isPalindrome checks that and returns true if check is palindrome and false if it is not.

- make your conditions case insensitive.  ex: Civic and civic are both palindromes
- make your conditions space insensitive.  Race car is a palindrome even though there is space in between.

Examples:

isPalindrome("Noon") ==> true

isPalindrome("I am not palindrome") ==> false

isPalindrome("wooden") ==> false

isPalindrome("Nurses Run") ==> true


 */
public class A194_Methods {

    public static boolean isPalindrome(String check) {
        String check2 = check.replace(" ", "");
        String reversedStr = "";

        for (int i = check2.length()-1; i >= 0 ; i--) {
            reversedStr += check2.charAt(i);
        }


        if ( reversedStr.equalsIgnoreCase(check2) ) {
            return true;
        } else {
            return false;
        }
    }

}

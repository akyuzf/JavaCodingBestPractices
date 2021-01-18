package Part1;

/*
Create a static method that:

is called appendPosSum
returns an ArrayList of Integers
takes one parameter: an ArrayList of Integers

This method should:
Create a new ArrayList of Integers
Add only the positive Integers to the new ArrayList
Sum the positive Integers in the new ArrayList and add the Sum as the last element

For example, if the incoming ArrayList contains the Integers (4,-6,3,-8,0,4,3), the ArrayList that gets returned should be (4,3,4,3,14), with 14 being the sum of (4,3,4,3).  The original ArrayList should remain unchanged.
 */
public class A190_Methods {

    public static boolean isPalindrome(String check) {

        String reverse = "";

        check = check.replaceAll(" ", "");
        for (int i = check.length() - 1; i >= 0; i--) {
            reverse += check.charAt(i);
        }

        if (check.equalsIgnoreCase(reverse)) {
            return true;
        } else {
            return false;
        }

    }

}

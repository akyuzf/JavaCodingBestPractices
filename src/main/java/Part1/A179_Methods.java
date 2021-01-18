package Part1;

/*
reverse method reverse a string.
it gets a string and returns it in reverse.

for example:

reverse("foo") ==> "oof"

reverse("student") ==> "tnedust"
 */
public class A179_Methods {

    public static String reverse(String input) {
        String str = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            str += input.charAt(i);
        }

        return str;
    }

}

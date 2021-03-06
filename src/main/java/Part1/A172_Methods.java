package Part1;

/*
at3 gets two strings and returns a string.

the first string is the one that will be manipulated. at the 3rd char position of target you will insert the word argument.

example use:

at3("longword","foo")
will return: "lonfoogword"

at3("blabla","a")
will return: "blaabla"

 */
public class A172_Methods {
    public static String at3(String target, String word) {

        return target.substring(0, 3) + word + target.substring(3);
    }

    public static void main(String[] args) {

        String res = at3("longword", "foo");
        System.out.println(res);
    }

}

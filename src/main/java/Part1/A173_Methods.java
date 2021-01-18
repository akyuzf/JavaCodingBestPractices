package Part1;

/*
the method gets two strings and return the longest one

biggerS("apple","orange") ==> "orange"

 */
public class A173_Methods {
    public static String biggerS(String a, String b) {

        if (a.length() > b.length()) {
            return a;
        } else {
            return b;
        }

    }

}

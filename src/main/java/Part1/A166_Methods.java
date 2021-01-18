package Part1;

/*
When gears merge and work together, one teeth from each one goes in order.
Write a method mergeStrings hat will return the strings merged, one letter at a time, starting with one.   Please note one and two can be of different lengths. Please look at below examples:

s1 ==> "12345"
s2 ==> "abcde"
mergeStrings(s1,s2) ==> "1a2b3c4d5e"

mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

mergeStrings("java", "selenium") ==> "jsaevlaenium"
 */
public class A166_Methods {
    public static String mergeStrings(String one, String two) {
        String merge = "";

        if (one.length() >= two.length()) {

            for (int i = 0; i <= two.length() - 1; i++) {
                merge += one.charAt(i);
                merge += two.charAt(i);
            }

            merge += one.substring(two.length());

        } else {
            for (int i = 0; i < one.length(); i++) {
                merge += one.charAt(i);
                merge += two.charAt(i);
            }
            merge += two.substring(one.length());

        }

        return merge;

    }


}

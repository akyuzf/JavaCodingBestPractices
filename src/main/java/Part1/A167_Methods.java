package Part1;

/*
uniqueChars is a method that you will code now, should be able to accept any string in the world and return unique characters from the parameter.

Examples:

uniqueChars("java") ==> "jav"

uniqueChars("mama") ==> "ma"

uniqueChars("spoon") ==> "spon"


 */
public class A167_Methods {

    public static String uniqueChars(String str) {
        String result = "";

        for( int i = 0; i < str.length(); i++){
            if(result.contains("" + str.charAt(i) ) ){
                continue;
            }
            result += str.charAt(i);
        }

        return result;

/*
 String str2 = "";

        for (int i = 0; i < str.length(); i++) {

            if (!str2.contains(""+ str.charAt(i) ) ) {
                str2 += str.charAt(i);
            }

        }

        return str2;
 */


    }

}

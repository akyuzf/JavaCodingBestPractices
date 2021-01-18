package Part1;

/*
Complete the combineNames method to return a new String array that is composed of the first name and last name of each of the parameters.

This may be confusing so look at the example:
first_names = {"bob","joe"}
last_names = {"jones","smith"}

returns a new String array with {"bob jones", "joe smith"}
 */
public class CombineToFullName {

    public static String[] combineNames(String[] first_names, String[] last_names) {
        String[] arr = new String[first_names.length];

        int i = 0;

        for (String each : arr) {
            arr[i] = first_names[i] + " " + last_names[i];
            i++;
        }

        return arr;

    }

    public static void main(String[] args) {
        //feel free to test code here
    }

}

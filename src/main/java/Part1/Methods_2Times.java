package Part1;

/*
Create a method that:

is called twoTimes
returns a new ArrayList of Integers
takes in a single parameter - an ArrayList of Integers

This method should create a new ArrayList of Integers that contains every value of the ArrayList parameter repeated twice.

For example, if the parameter is
(1,5,3,7)
The method should return a new ArrayList of Integers with
(1,1,5,5,3,3,7,7)
 */
import java.util.ArrayList;

public class Methods_2Times {
    //create your method below
    public static ArrayList<Integer> twoTimes(ArrayList<Integer> intArr) {

        ArrayList<Integer> doubArr = new ArrayList<>();

        for (int num : intArr) {
            doubArr.add(num);
            doubArr.add(num);
        }

        return doubArr;

    }
}

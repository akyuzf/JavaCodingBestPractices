package Part1;

import java.util.ArrayList;
import java.util.Arrays;

/*
We will be manipulating elements of an ArrayList by using List methods.

The first List method we will learn is .add()

The following code will take an ArrayList of Strings called strs and add "Hello" to it.
str.add("Hello");

The syntax follows something like:
arraylistvariable.add(data to add);

In the space to the left, add three names (any names) to the ArrayList called names.
 */
public class A180_Methods {


    public static ArrayList<String> test()
    {
        ArrayList<String> names = new ArrayList<String>();
        //write code below


        names.add(0, "Ali");
        names.add(1, "Veli");
        names.add(2, "Deli");

        return names;

        //leave below code alone

    }


}
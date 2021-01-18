package Part1;

/*
This method gets an arraylist of Integers and a number(Integer).it returns an arraylist.

It removes any instance of the number it gets from the arraylist.

for example:

romoveInst([1,1,2,3,1,4],1)
returns: [2,3,4]

romoveInst([3,4,3,3],4)
returns: [3,3,3]

 */
import java.util.ArrayList;
import java.util.Arrays;

public class Methods_RemoveInstances {

    public static ArrayList<Integer> removeInst(ArrayList<Integer> r, Integer n) {

        while (r.contains(n)) {
            r.remove(n);
        }
        return r;
    }


}

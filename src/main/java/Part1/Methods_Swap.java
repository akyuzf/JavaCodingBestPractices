package Part1;

import java.util.ArrayList;

public class Methods_Swap {

    public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2) {

        String first = list.get(pos1);
        String last = list.get(pos2);

        list.set(pos1, last);
        list.set(pos2, first);
        return list;

    }

}

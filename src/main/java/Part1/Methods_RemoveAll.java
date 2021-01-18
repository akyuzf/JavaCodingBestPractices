package Part1;

import java.util.ArrayList;
import java.util.Arrays;

public class Methods_RemoveAll {

    public static ArrayList<String> removeAll(ArrayList<String> wordList, String targetWord) {

        wordList.removeAll(Arrays.asList(targetWord));
        return wordList;
    }

}

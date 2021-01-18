package Part1;

/*
isError method checks if the line of string it gets has the word error at the start of it.

it gets a string and returns a boolean.
true if it found the word 'error' an the start of the line string

example use:

isError("foo bar")
returns : false

isError("error foo bar")
returns : true

isError("error one two")
returns : true

isError("three four error")
returns : false

 */
public class A189_Methods {
    public static boolean isError(String line) {

        if (line.startsWith("error")) {
            return true;
        } else {
            return false;
        }

    }
}

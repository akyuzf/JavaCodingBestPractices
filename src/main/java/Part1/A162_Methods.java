package Part1;

/*
This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.

It returns true only if both a and b are true or c is true.

https://en.wikipedia.org/wiki/Truth_table
 */
public class A162_Methods {

    public static boolean threeLocks(boolean a, boolean b, boolean c) {

        return (a && b == true || c == true) ? true : false;

/*
  if (a  && b == true || c == true){

            return true;
        } else {
        return false;
        }

 */


    }//end threeLocks

}

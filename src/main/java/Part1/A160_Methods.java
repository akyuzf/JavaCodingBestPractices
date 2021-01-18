package Part1;

/*
The danish prince most famous quote is "to be or not to be". thats a classic example of boolean logic.

the hamletQuote method only returns true if one of  or both of the boolean parameters is true.

example:

hamletQuote(true, false)
returns true

hamletQuote(false,true)
returns true

hamletQuote(true,true)
returns true

hamletQuote(false,false)
returns false
 */
public class A160_Methods {

    public static boolean hamletQuote(boolean toBe,boolean notToBe){
        return toBe || notToBe;

/*
     if (toBe && !notToBe || toBe && notToBe || !toBe && notToBe ){

            return true;
        } else {
            return false;
        }
 */

    }

}

package Part1;

/*
isEven method gets a number(int) if its even (2,4,8...) returns true.
if its odd return false.

for example:

isEven(1) --> false

isEven(8) --> true


 */
public class A158_Methods {

    public static boolean isEven(int n){
        if(n%2==0) {
            return true;
        } else {
            return false;
        }

    }
}

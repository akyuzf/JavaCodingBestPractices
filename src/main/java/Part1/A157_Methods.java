package Part1;

/*
max function gets two ints, x and y.
x is the test case, y is what we test against.

if  x is bigger then y return y
in any other case return x.

for example:

max(1,10)
returns 1

max(11,5)
returns 5
 */
public class A157_Methods {

    public static int max(int x, int y) {

        if (x >= y) {
            return y;
        } else {
            return x;
        }

    }

    public static void main(String[] args) {

        System.out.println(max(15,10));
    }
}

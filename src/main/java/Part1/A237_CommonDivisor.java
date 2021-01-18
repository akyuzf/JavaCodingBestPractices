package Part1;

/*
Given two positive integers m and n, find their greatest common divisor, that is, the largest positive integer that evenly divides both m and n.
Example:
if m = 15 and n = 25, then result greatest common divisor is = 5.

 */
public class A237_CommonDivisor {

    public static int commonDivisor(int m, int n){
        //WRITE YOUR CODE HERE

        while (m != n) {
            if(m > n) {
                m = m - n;
            }else {
                n = n - m;
            }
        }

        return n;
    }

    public static void main(String[] args) {
        System.out.println(commonDivisor(15, 25)); //5
        System.out.println(commonDivisor(40, 124)); //4
        System.out.println(commonDivisor(120, 60)); //60
        System.out.println(commonDivisor(80, 60)); //20
    }


}

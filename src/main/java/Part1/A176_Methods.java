package Part1;

/*
In this task, you need to write 2 methods findMax() that will find a maximum number in the array. First method should work with array of integers (int[]) and return int, and second method should work with an array of doubles (double[]) and return double as a result.
Methods must have the same name and different parameters.
Fo more information:  https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html

Comment: Methods should be non static and with a return type.
 */
import java.util.Arrays;

public class A176_Methods {


        public int findMax(int[] arr) {

            Arrays.sort(arr);
            int maxNum = arr[arr.length - 1];

            return maxNum;
        }

        public double findMax(double[] arr) {

            Arrays.sort(arr);
            double maxNum = arr[arr.length - 1];

            return maxNum;
        }

/*
   public  int findMax(int[] numberF) {

        int number1 = 0;
        for (int i = 0; i < numberF.length; i++) {
            if (numberF[i]>number1){
                number1 = numberF[i];
            }
        }

        return number1;
    }


    public  double findMax(double[] numberD) {
        double number2 = 0.0;
        for (int i = 0; i < numberD.length; i++) {
            if (numberD[i]>number2){
                number2 = numberD[i];
            }
        }
        return number2;
    }

 */


}


package Part1;

import java.util.Scanner;

/*
Create a method called plus_minus that gets an array of ints (int[]), it outputs how many negative , positive and zero numbers are in the array.

for example:

plus_minus (new int[]{1,2,55,-9,-2,0});

will output:
positives:3, negatives:2, zeros:1

 */
public class A145_Method7 {

    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        System.out.println("Enter size pls:");
        int size = inp.nextInt();
        System.out.println("Enter each item pls:");
        int[] arr = new int[size];
        for (int i = 0; i <= size - 1; i++) {

            arr[i] = inp.nextInt();
        }

        plus_minus(arr);


    }

    public static void plus_minus(int[] arr){
        int pcount = 0;
        int ncount = 0;
        int zeros = 0;

        for (int each : arr  ) {
            if (each > 0){
                pcount++;
            } else if (each < 0 ){
                ncount++;
            } else {
                zeros++;
            }
        }

        System.out.println("positives:" + pcount + ", negativies:" + ncount + ", zeros:" + zeros);

    }


}

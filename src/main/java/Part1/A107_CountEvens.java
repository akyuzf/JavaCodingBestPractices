package Part1;

/*
Given an array nums, calculate count of even numbers in nums and print out to console.

nums → [2, 1, 2, 3, 4]) → 3
nums → [2, 2, 0, 3, 5]) → 3
nums → [1, 3, 5, 7, 9]) → 0
 */
import java.util.Scanner;

public class A107_CountEvens {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        int count = 0;
        for (int each : nums) {
            if (each % 2 == 0) {
                count++;
            }
        }

        System.out.println(count);

/*
    int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] %2 == 0){
            count++;
            }
        }
        System.out.println(count);

 */


    }

}

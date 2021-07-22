package ReplItSecondsTasks;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxSort {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        Arrays.sort(nums);

        int maxNum = nums[nums.length-1];

        System.out.println(maxNum);

    }

}

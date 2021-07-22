package ReplItSecondsTasks;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArraySwap {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),
                input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int temp = nums[0];
        nums[0] = nums[6];
        nums[6] = temp;

        temp = nums[1];
        nums[1]=nums[5];
        nums[5]=temp;

        temp = nums[2];
        nums[2] = nums[4];
        nums[4] = temp;



        System.out.println(Arrays.toString(nums));

    }





}

package ReplItSecondsTasks;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftLeft {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < size; i++){
            nums[i] = scan.nextInt();
        }

        int [] shifted = new int [nums.length];
        for(int i=1; i<nums.length; i++){
            shifted[i-1]=nums[i];
        }
        shifted[shifted.length-1]=nums[0];
        System.out.println(Arrays.toString(shifted));


    }
}

package ReplItSecondsTasks;

import java.util.Scanner;

public class MaxNumInArray {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int maxNum = -2147483648;

        for(int i=0; i<=nums.length-1; i++){
            if(nums[i]>maxNum){
                maxNum=nums[i];
            }
        }
        System.out.println("Maximum number: " + maxNum);


    }

}

package ReplItSecondsTasks;

import java.util.Scanner;

public class Has55 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),
                input.nextInt(),input.nextInt()};

        int count = 0;

        for(int i=0; i<nums.length-1; i++) {
            if (nums[i] == 5 && nums[i + 1] == 5) {
                count++;
            }
        }
        if(count>=1) {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }


    }
}

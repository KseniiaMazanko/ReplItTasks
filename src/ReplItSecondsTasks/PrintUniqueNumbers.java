package ReplItSecondsTasks;

import java.util.Scanner;

public class PrintUniqueNumbers {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);


    }

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE



        for (int each : nums) {
            int count=0;
            for(int i=0; i<nums.length; i++){

                if(each==nums[i]) {
                    count++;
                }
            }
            if(count==1){
                System.out.println(each);
            }



        }

    }



}

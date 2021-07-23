package ReplItSecondsTasks;

import java.util.Scanner;

public class OverloadMax {

    public static int findMax(int[] arr){

        int max =0;
        for (int each : arr) {
            max=Math.max(each,max);
        }
        return max;

    }
    public static double findMax(double[] arr){

        double max =0;
        for (double each : arr) {
            max=Math.max(each, max);
        }
        return max;

    }



    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        boolean runInt = in.nextBoolean();
        int size = in.nextInt();

        if (runInt) {
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println(findMax(arr));
        } else {
            double[] arr = new double[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextDouble();
            }
            System.out.println(findMax(arr));
        }

    }
}

package ReplItSecondsTasks;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLargestNumber2 {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0 ;i<=rows-1;i++){
            for(int j=0 ;j<=cols-1;j++){
                arr[i][j]=inp.nextInt();
            }//end for cols
        }//end for rows

        int max = arr[0] [0];

        for (int[] eachArr : arr) {
            for(int i=0; i<eachArr.length; i++){
                if(eachArr[i]>max){
                    max = eachArr[i];
                }
            }
        }

        for (int[] each : arr) {
            for (int num : each) {
                num=max;
            }
        }

        System.out.println(Arrays.deepToString(arr));

    }

}

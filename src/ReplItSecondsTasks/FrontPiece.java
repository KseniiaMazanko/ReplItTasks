package ReplItSecondsTasks;

import java.util.Arrays;
import java.util.Scanner;

public class FrontPiece {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
        }



        if(size>=2){
            int [] firstTwo = {num[0], num[1]};
            System.out.println(Arrays.toString(firstTwo));
        }
        else{
            System.out.println(Arrays.toString(num));
        }

        //much more comlicated option
        /*
        int [] result = new int[2];
        int [] result2 = new int[1];

        int j=0;
        if(size>=2){
            do {
                for (int i = 0; i < 2; i++) {
                    result[j] = num[i];
                    j++;
                }
            }
            while(j<=1);
            System.out.println(Arrays.toString(result));
            }
        else{
            for(int i=0; i<1; i++){
                result2[j]=num[i];
            }
            System.out.println(Arrays.toString(result2));
        }
        */



    }


}

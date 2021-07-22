package ReplItSecondsTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Diving {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        float[] score = new float[7];

        for (int i=0; i<7; i++){
            System.out.println("Enter score for judge " + (i+1));
            score[i] = input.nextFloat();
        }

        System.out.println("Enter difficulty:");
        float difficulty = input.nextFloat();

        Arrays.sort(score);
        float sum  = 0;

        for(int i=1; i<score.length-1; i++){
            sum+=score[i];
        }

        float total = (float)(sum * difficulty * 0.6);

        System.out.println("Total: " + total);





    }

}

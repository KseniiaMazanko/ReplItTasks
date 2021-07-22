package ReplItSecondsTasks;

import java.util.Arrays;
import java.util.Scanner;

public class PrintFirstAndLastChar2 {


    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),
                input.nextLine(),input.nextLine()};


        String [] result = new String [words.length];
        String el = "";

        int j=0;
        for (String eachWord : words) {
            for(int i=0; i<eachWord.length(); i++){
                el= "" + eachWord.charAt(0)+eachWord.charAt(eachWord.length()-1);
            }
            result[j]=el;
            j++;
        }
        System.out.println(Arrays.toString(result));


    }

}

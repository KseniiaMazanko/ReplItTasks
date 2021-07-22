package ReplItSecondsTasks;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSentence {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reverse = "";

        String [] reverseArr = sentence.split(" ");

        for(int i=reverseArr.length-1; i>=0; i--){
            reverse+=reverseArr[i] + " ";
        }

        System.out.println(reverse);

    }



}

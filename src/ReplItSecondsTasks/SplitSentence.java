package ReplItSecondsTasks;

import java.util.Scanner;

public class SplitSentence {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String [] sentenceArr = sentence.split(" ");

        for (String each : sentenceArr) {
            System.out.print(each);
        }


    }

}

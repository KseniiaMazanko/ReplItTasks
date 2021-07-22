package ReplItSecondsTasks;

import java.util.Scanner;

public class RepeatSeparator {

    public static void main(String[] args) {

        /*
        Given two strings, word and a separator sep, return a big string made of count occurrences of the word,
        separated by the separator string.

        Example:

        input:
        Word
        X
        3
        output: WordXWordXWord
         */

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();


        String result = "";

        for (int i=0; i<count; i++){
            result +=(word+separator);
        }
        result=result.substring(0,result.lastIndexOf(separator));
        System.out.print(result);


    }

}

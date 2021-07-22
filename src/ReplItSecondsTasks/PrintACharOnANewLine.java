package ReplItSecondsTasks;

import java.util.Scanner;

public class PrintACharOnANewLine {

    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();

        for (int i=0; i<word.length(); i++){
            System.out.println(word.charAt(i));
        }


    }

}
